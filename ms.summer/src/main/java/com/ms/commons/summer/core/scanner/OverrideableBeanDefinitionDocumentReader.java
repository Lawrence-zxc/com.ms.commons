/*
 * Copyright 2017-2025 msun.com All right reserved. This software is the confidential and proprietary information of
 * msun.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with msun.com.
 */
package com.ms.commons.summer.core.scanner;

import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Element;

/**
 * 覆盖DefaultBeanDefinitionDocumentReader的createHelper方法，为bean定义的分析提供可覆写的机制
 * 
 * @author zxc Apr 12, 2013 4:08:58 PM
 */
public class OverrideableBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {

    protected BeanDefinitionParserDelegate createHelper(XmlReaderContext readerContext, Element root) {
        OverrideableBeanDefinitionParserDelegate delegate = new OverrideableBeanDefinitionParserDelegate(readerContext);
        delegate.initDefaults(root);
        return delegate;
    }
}
