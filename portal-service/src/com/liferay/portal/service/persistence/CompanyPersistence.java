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

package com.liferay.portal.service.persistence;

/**
 * <a href="CompanyPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface CompanyPersistence {
	public com.liferay.portal.model.Company create(long companyId);

	public com.liferay.portal.model.Company remove(long companyId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company remove(
		com.liferay.portal.model.Company company)
		throws com.liferay.portal.SystemException;

	/**
	 * @deprecated Use <code>update(Company company, boolean merge)</code>.
	 */
	public com.liferay.portal.model.Company update(
		com.liferay.portal.model.Company company)
		throws com.liferay.portal.SystemException;

	/**
	 * Add, update, or merge, the entity. This method also calls the model
	 * listeners to trigger the proper events associated with adding, deleting,
	 * or updating an entity.
	 *
	 * @param        company the entity to add, update, or merge
	 * @param        merge boolean value for whether to merge the entity. The
	 *                default value is false. Setting merge to true is more
	 *                expensive and should only be true when company is
	 *                transient. See LEP-5473 for a detailed discussion of this
	 *                method.
	 * @return        true if the portlet can be displayed via Ajax
	 */
	public com.liferay.portal.model.Company update(
		com.liferay.portal.model.Company company, boolean merge)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company updateImpl(
		com.liferay.portal.model.Company company, boolean merge)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company findByPrimaryKey(long companyId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company fetchByPrimaryKey(long companyId)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company findByWebId(java.lang.String webId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company fetchByWebId(java.lang.String webId)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company findByVirtualHost(
		java.lang.String virtualHost)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company fetchByVirtualHost(
		java.lang.String virtualHost) throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company findByMx(java.lang.String mx)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company fetchByMx(java.lang.String mx)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company findByLogoId(long logoId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public com.liferay.portal.model.Company fetchByLogoId(long logoId)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.model.Company> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.model.Company> findAll(int start,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.model.Company> findAll(int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeByWebId(java.lang.String webId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public void removeByVirtualHost(java.lang.String virtualHost)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public void removeByMx(java.lang.String mx)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public void removeByLogoId(long logoId)
		throws com.liferay.portal.NoSuchCompanyException,
			com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countByWebId(java.lang.String webId)
		throws com.liferay.portal.SystemException;

	public int countByVirtualHost(java.lang.String virtualHost)
		throws com.liferay.portal.SystemException;

	public int countByMx(java.lang.String mx)
		throws com.liferay.portal.SystemException;

	public int countByLogoId(long logoId)
		throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;

	public void registerListener(
		com.liferay.portal.model.ModelListener listener);

	public void unregisterListener(
		com.liferay.portal.model.ModelListener listener);
}