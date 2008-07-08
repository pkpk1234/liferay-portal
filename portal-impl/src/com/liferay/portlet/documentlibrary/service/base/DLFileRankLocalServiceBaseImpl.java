/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.documentlibrary.service.base;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.counter.service.CounterLocalServiceFactory;
import com.liferay.counter.service.CounterService;
import com.liferay.counter.service.CounterServiceFactory;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.service.LayoutLocalService;
import com.liferay.portal.service.LayoutLocalServiceFactory;
import com.liferay.portal.service.LayoutService;
import com.liferay.portal.service.LayoutServiceFactory;
import com.liferay.portal.service.persistence.LayoutFinder;
import com.liferay.portal.service.persistence.LayoutFinderUtil;
import com.liferay.portal.service.persistence.LayoutPersistence;
import com.liferay.portal.service.persistence.LayoutUtil;

import com.liferay.portlet.documentlibrary.model.DLFileRank;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFileEntryService;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFileRankLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutLocalServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutService;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalService;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalService;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceFactory;
import com.liferay.portlet.documentlibrary.service.DLFolderService;
import com.liferay.portlet.documentlibrary.service.DLFolderServiceFactory;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryAndShortcutFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryAndShortcutFinderUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryFinderUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileRankFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileRankFinderUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileRankPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileRankUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileShortcutFinder;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileShortcutFinderUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileShortcutPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileShortcutUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileVersionPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileVersionUtil;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderPersistence;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderUtil;

import java.util.List;

/**
 * <a href="DLFileRankLocalServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public abstract class DLFileRankLocalServiceBaseImpl
	implements DLFileRankLocalService {
	public DLFileRank addDLFileRank(DLFileRank dlFileRank)
		throws SystemException {
		dlFileRank.setNew(true);

		return dlFileRankPersistence.update(dlFileRank, false);
	}

	public void deleteDLFileRank(long fileRankId)
		throws PortalException, SystemException {
		dlFileRankPersistence.remove(fileRankId);
	}

	public void deleteDLFileRank(DLFileRank dlFileRank)
		throws SystemException {
		dlFileRankPersistence.remove(dlFileRank);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return dlFileRankPersistence.findWithDynamicQuery(dynamicQuery);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) throws SystemException {
		return dlFileRankPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	public DLFileRank getDLFileRank(long fileRankId)
		throws PortalException, SystemException {
		return dlFileRankPersistence.findByPrimaryKey(fileRankId);
	}

	public DLFileRank updateDLFileRank(DLFileRank dlFileRank)
		throws SystemException {
		dlFileRank.setNew(false);

		return dlFileRankPersistence.update(dlFileRank, true);
	}

	public DLFileEntryLocalService getDLFileEntryLocalService() {
		return dlFileEntryLocalService;
	}

	public void setDLFileEntryLocalService(
		DLFileEntryLocalService dlFileEntryLocalService) {
		this.dlFileEntryLocalService = dlFileEntryLocalService;
	}

	public DLFileEntryService getDLFileEntryService() {
		return dlFileEntryService;
	}

	public void setDLFileEntryService(DLFileEntryService dlFileEntryService) {
		this.dlFileEntryService = dlFileEntryService;
	}

	public DLFileEntryPersistence getDLFileEntryPersistence() {
		return dlFileEntryPersistence;
	}

	public void setDLFileEntryPersistence(
		DLFileEntryPersistence dlFileEntryPersistence) {
		this.dlFileEntryPersistence = dlFileEntryPersistence;
	}

	public DLFileEntryFinder getDLFileEntryFinder() {
		return dlFileEntryFinder;
	}

	public void setDLFileEntryFinder(DLFileEntryFinder dlFileEntryFinder) {
		this.dlFileEntryFinder = dlFileEntryFinder;
	}

	public DLFileEntryAndShortcutFinder getDLFileEntryAndShortcutFinder() {
		return dlFileEntryAndShortcutFinder;
	}

	public void setDLFileEntryAndShortcutFinder(
		DLFileEntryAndShortcutFinder dlFileEntryAndShortcutFinder) {
		this.dlFileEntryAndShortcutFinder = dlFileEntryAndShortcutFinder;
	}

	public DLFileRankPersistence getDLFileRankPersistence() {
		return dlFileRankPersistence;
	}

	public void setDLFileRankPersistence(
		DLFileRankPersistence dlFileRankPersistence) {
		this.dlFileRankPersistence = dlFileRankPersistence;
	}

	public DLFileRankFinder getDLFileRankFinder() {
		return dlFileRankFinder;
	}

	public void setDLFileRankFinder(DLFileRankFinder dlFileRankFinder) {
		this.dlFileRankFinder = dlFileRankFinder;
	}

	public DLFileShortcutLocalService getDLFileShortcutLocalService() {
		return dlFileShortcutLocalService;
	}

	public void setDLFileShortcutLocalService(
		DLFileShortcutLocalService dlFileShortcutLocalService) {
		this.dlFileShortcutLocalService = dlFileShortcutLocalService;
	}

	public DLFileShortcutService getDLFileShortcutService() {
		return dlFileShortcutService;
	}

	public void setDLFileShortcutService(
		DLFileShortcutService dlFileShortcutService) {
		this.dlFileShortcutService = dlFileShortcutService;
	}

	public DLFileShortcutPersistence getDLFileShortcutPersistence() {
		return dlFileShortcutPersistence;
	}

	public void setDLFileShortcutPersistence(
		DLFileShortcutPersistence dlFileShortcutPersistence) {
		this.dlFileShortcutPersistence = dlFileShortcutPersistence;
	}

	public DLFileShortcutFinder getDLFileShortcutFinder() {
		return dlFileShortcutFinder;
	}

	public void setDLFileShortcutFinder(
		DLFileShortcutFinder dlFileShortcutFinder) {
		this.dlFileShortcutFinder = dlFileShortcutFinder;
	}

	public DLFileVersionLocalService getDLFileVersionLocalService() {
		return dlFileVersionLocalService;
	}

	public void setDLFileVersionLocalService(
		DLFileVersionLocalService dlFileVersionLocalService) {
		this.dlFileVersionLocalService = dlFileVersionLocalService;
	}

	public DLFileVersionPersistence getDLFileVersionPersistence() {
		return dlFileVersionPersistence;
	}

	public void setDLFileVersionPersistence(
		DLFileVersionPersistence dlFileVersionPersistence) {
		this.dlFileVersionPersistence = dlFileVersionPersistence;
	}

	public DLFolderLocalService getDLFolderLocalService() {
		return dlFolderLocalService;
	}

	public void setDLFolderLocalService(
		DLFolderLocalService dlFolderLocalService) {
		this.dlFolderLocalService = dlFolderLocalService;
	}

	public DLFolderService getDLFolderService() {
		return dlFolderService;
	}

	public void setDLFolderService(DLFolderService dlFolderService) {
		this.dlFolderService = dlFolderService;
	}

	public DLFolderPersistence getDLFolderPersistence() {
		return dlFolderPersistence;
	}

	public void setDLFolderPersistence(DLFolderPersistence dlFolderPersistence) {
		this.dlFolderPersistence = dlFolderPersistence;
	}

	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	public CounterService getCounterService() {
		return counterService;
	}

	public void setCounterService(CounterService counterService) {
		this.counterService = counterService;
	}

	public LayoutLocalService getLayoutLocalService() {
		return layoutLocalService;
	}

	public void setLayoutLocalService(LayoutLocalService layoutLocalService) {
		this.layoutLocalService = layoutLocalService;
	}

	public LayoutService getLayoutService() {
		return layoutService;
	}

	public void setLayoutService(LayoutService layoutService) {
		this.layoutService = layoutService;
	}

	public LayoutPersistence getLayoutPersistence() {
		return layoutPersistence;
	}

	public void setLayoutPersistence(LayoutPersistence layoutPersistence) {
		this.layoutPersistence = layoutPersistence;
	}

	public LayoutFinder getLayoutFinder() {
		return layoutFinder;
	}

	public void setLayoutFinder(LayoutFinder layoutFinder) {
		this.layoutFinder = layoutFinder;
	}

	protected void init() {
		if (dlFileEntryLocalService == null) {
			dlFileEntryLocalService = DLFileEntryLocalServiceFactory.getImpl();
		}

		if (dlFileEntryService == null) {
			dlFileEntryService = DLFileEntryServiceFactory.getImpl();
		}

		if (dlFileEntryPersistence == null) {
			dlFileEntryPersistence = DLFileEntryUtil.getPersistence();
		}

		if (dlFileEntryFinder == null) {
			dlFileEntryFinder = DLFileEntryFinderUtil.getFinder();
		}

		if (dlFileEntryAndShortcutFinder == null) {
			dlFileEntryAndShortcutFinder = DLFileEntryAndShortcutFinderUtil.getFinder();
		}

		if (dlFileRankPersistence == null) {
			dlFileRankPersistence = DLFileRankUtil.getPersistence();
		}

		if (dlFileRankFinder == null) {
			dlFileRankFinder = DLFileRankFinderUtil.getFinder();
		}

		if (dlFileShortcutLocalService == null) {
			dlFileShortcutLocalService = DLFileShortcutLocalServiceFactory.getImpl();
		}

		if (dlFileShortcutService == null) {
			dlFileShortcutService = DLFileShortcutServiceFactory.getImpl();
		}

		if (dlFileShortcutPersistence == null) {
			dlFileShortcutPersistence = DLFileShortcutUtil.getPersistence();
		}

		if (dlFileShortcutFinder == null) {
			dlFileShortcutFinder = DLFileShortcutFinderUtil.getFinder();
		}

		if (dlFileVersionLocalService == null) {
			dlFileVersionLocalService = DLFileVersionLocalServiceFactory.getImpl();
		}

		if (dlFileVersionPersistence == null) {
			dlFileVersionPersistence = DLFileVersionUtil.getPersistence();
		}

		if (dlFolderLocalService == null) {
			dlFolderLocalService = DLFolderLocalServiceFactory.getImpl();
		}

		if (dlFolderService == null) {
			dlFolderService = DLFolderServiceFactory.getImpl();
		}

		if (dlFolderPersistence == null) {
			dlFolderPersistence = DLFolderUtil.getPersistence();
		}

		if (counterLocalService == null) {
			counterLocalService = CounterLocalServiceFactory.getImpl();
		}

		if (counterService == null) {
			counterService = CounterServiceFactory.getImpl();
		}

		if (layoutLocalService == null) {
			layoutLocalService = LayoutLocalServiceFactory.getImpl();
		}

		if (layoutService == null) {
			layoutService = LayoutServiceFactory.getImpl();
		}

		if (layoutPersistence == null) {
			layoutPersistence = LayoutUtil.getPersistence();
		}

		if (layoutFinder == null) {
			layoutFinder = LayoutFinderUtil.getFinder();
		}
	}

	protected DLFileEntryLocalService dlFileEntryLocalService;
	protected DLFileEntryService dlFileEntryService;
	protected DLFileEntryPersistence dlFileEntryPersistence;
	protected DLFileEntryFinder dlFileEntryFinder;
	protected DLFileEntryAndShortcutFinder dlFileEntryAndShortcutFinder;
	protected DLFileRankPersistence dlFileRankPersistence;
	protected DLFileRankFinder dlFileRankFinder;
	protected DLFileShortcutLocalService dlFileShortcutLocalService;
	protected DLFileShortcutService dlFileShortcutService;
	protected DLFileShortcutPersistence dlFileShortcutPersistence;
	protected DLFileShortcutFinder dlFileShortcutFinder;
	protected DLFileVersionLocalService dlFileVersionLocalService;
	protected DLFileVersionPersistence dlFileVersionPersistence;
	protected DLFolderLocalService dlFolderLocalService;
	protected DLFolderService dlFolderService;
	protected DLFolderPersistence dlFolderPersistence;
	protected CounterLocalService counterLocalService;
	protected CounterService counterService;
	protected LayoutLocalService layoutLocalService;
	protected LayoutService layoutService;
	protected LayoutPersistence layoutPersistence;
	protected LayoutFinder layoutFinder;
}