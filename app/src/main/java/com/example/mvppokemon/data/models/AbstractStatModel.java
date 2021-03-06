package com.example.mvppokemon.data.models;

import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.requery.CascadeAction;
import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.OneToOne;
import io.requery.Persistable;

@Entity
public abstract class AbstractStatModel implements Persistable, Parcelable {

    @Key
    @Generated
    long id;

    @JsonProperty("url")
    String url;

    @JsonProperty("name")
    String name;

    @OneToOne(mappedBy = "statModel", cascade = {CascadeAction.DELETE, CascadeAction.SAVE})
    StatsModel statsModel;
}
