package com.ingenico.direct.sdk.client.android.model.api;

import java.io.Serializable;

/**
 * The error item in the error body
 *
 * Copyright 2020 Global Collect Services B.V
 *
 */
public class ApiErrorItem implements Serializable {

    private static final long serialVersionUID = 1983759919374923872L;

    /**
     * The error code
     */
    public String code;

    /**
     * The error message
     */
    public String message;
}
