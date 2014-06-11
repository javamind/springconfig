package com.javamind.springconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * {@link }
 *
 * @author EHRET_G
 */

public class AuthorService {

    Map<String, String> maMapExemple;

    public Map<String, String> getMaMapExemple() {
        return maMapExemple;
    }

    public void setMaMapExemple(Map<String, String> maMapExemple) {
        this.maMapExemple = maMapExemple;
    }
}
