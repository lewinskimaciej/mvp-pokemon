package com.example.mvp_pokemon.presentation;

/**
 * Created on 27.01.2017.
 *
 * @author Maciej Lewinski
 */

public interface HttpExceptionResolutionInterface {
    void onInternalServerError();

    void onNotFound();

    void onGenericError();
}
