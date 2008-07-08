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

package com.liferay.portal.service;


/**
 * <a href="EmailAddressLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides static methods for the
 * <code>com.liferay.portal.service.EmailAddressLocalService</code>
 * bean. The static methods of this class calls the same methods of the bean
 * instance. It's convenient to be able to just write one line to call a method
 * on a bean instead of writing a lookup call and a method call.
 * </p>
 *
 * <p>
 * <code>com.liferay.portal.service.EmailAddressLocalServiceFactory</code>
 * is responsible for the lookup of the bean.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.service.EmailAddressLocalService
 * @see com.liferay.portal.service.EmailAddressLocalServiceFactory
 *
 */
public class EmailAddressLocalServiceUtil {
	public static com.liferay.portal.model.EmailAddress addEmailAddress(
		com.liferay.portal.model.EmailAddress emailAddress)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.addEmailAddress(emailAddress);
	}

	public static void deleteEmailAddress(long emailAddressId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		emailAddressLocalService.deleteEmailAddress(emailAddressId);
	}

	public static void deleteEmailAddress(
		com.liferay.portal.model.EmailAddress emailAddress)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		emailAddressLocalService.deleteEmailAddress(emailAddress);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.dynamicQuery(dynamicQuery);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public static com.liferay.portal.model.EmailAddress getEmailAddress(
		long emailAddressId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.getEmailAddress(emailAddressId);
	}

	public static com.liferay.portal.model.EmailAddress updateEmailAddress(
		com.liferay.portal.model.EmailAddress emailAddress)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.updateEmailAddress(emailAddress);
	}

	public static com.liferay.portal.model.EmailAddress addEmailAddress(
		long userId, java.lang.String className, long classPK,
		java.lang.String address, int typeId, boolean primary)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.addEmailAddress(userId, className,
			classPK, address, typeId, primary);
	}

	public static void deleteEmailAddresses(long companyId,
		java.lang.String className, long classPK)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		emailAddressLocalService.deleteEmailAddresses(companyId, className,
			classPK);
	}

	public static java.util.List<com.liferay.portal.model.EmailAddress> getEmailAddresses()
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.getEmailAddresses();
	}

	public static java.util.List<com.liferay.portal.model.EmailAddress> getEmailAddresses(
		long companyId, java.lang.String className, long classPK)
		throws com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.getEmailAddresses(companyId, className,
			classPK);
	}

	public static com.liferay.portal.model.EmailAddress updateEmailAddress(
		long emailAddressId, java.lang.String address, int typeId,
		boolean primary)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		EmailAddressLocalService emailAddressLocalService = EmailAddressLocalServiceFactory.getService();

		return emailAddressLocalService.updateEmailAddress(emailAddressId,
			address, typeId, primary);
	}
}