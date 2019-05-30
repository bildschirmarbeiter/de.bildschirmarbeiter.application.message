package de.bildschirmarbeiter.application.message.api;

import java.util.UUID;

import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public interface Message {

    @NotNull
    Long timestamp();

    @NotNull
    UUID uuid();

    @NotNull
    Object source();

}
