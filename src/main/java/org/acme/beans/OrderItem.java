/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.beans;

public class OrderItem implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    private java.lang.String code;
    private java.lang.Boolean eligible;
    private java.lang.String productCode;

    public java.lang.String getCode() {
        return code;
    }

    public java.lang.Boolean getEligible() {
        return eligible;
    }

    public java.lang.String getProductCode() {
        return productCode;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setEligible(java.lang.Boolean eligible) {
        this.eligible = eligible;
    }

    public void setProductCode(java.lang.String productCode) {
        this.productCode = productCode;
    }

}
