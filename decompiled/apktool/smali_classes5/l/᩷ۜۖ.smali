.class public abstract Ll/᩷ۜۖ;
.super Ll/ۖۜۖ;
.source "N9Q4"

# interfaces
.implements Ll/ܳ֡ۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 294
    invoke-direct {p0}, Ll/ۖۜۖ;-><init>()V

    return-void
.end method

.method public static ֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;
    .locals 5

    .line 446
    new-instance v0, Ll/ᩳ֨ۖ;

    invoke-static {p0}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;)Ljava/util/ArrayList;

    move-result-object p0

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Message missing required fields: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic build()Ll/ۡ֡ۖ;
    .locals 1

    .line 78
    invoke-interface {p0}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Ll/ۡ֡ۖ;
    .locals 1

    .line 78
    invoke-interface {p0}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clear()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clear()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public clear()Ll/᩷ۜۖ;
    .locals 2

    .line 324
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 325
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    invoke-interface {p0, v1}, Ll/ܳ֡ۖ;->clearField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public bridge synthetic clearOneof(Ll/ܶۖۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->clearOneof(Ll/ܶۖۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Ll/ܶۖۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 319
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "clearOneof() is not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clone()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۖۜۖ;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clone()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۢ֡ۖ;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clone()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ܳ֡ۖ;
    .locals 1

    .line 293
    invoke-virtual {p0}, Ll/᩷ۜۖ;->clone()Ll/᩷ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/᩷ۜۖ;
    .locals 2

    .line 301
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "clone() should be implemented in subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispose()V
    .locals 2

    .line 469
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public findInitializationErrors()Ljava/util/List;
    .locals 1

    .line 332
    invoke-static {p0}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 19
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public getFieldBuilder(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 428
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getFieldBuilder() called on an unsupported message type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getInitializationErrorString()Ljava/lang/String;
    .locals 1

    .line 337
    invoke-virtual {p0}, Ll/᩷ۜۖ;->findInitializationErrors()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/۠֡ۖ;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 313
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getOneofFieldDescriptor() is not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getRepeatedFieldBuilder(Ll/֡ۖۖ;I)Ll/ܳ֡ۖ;
    .locals 0

    .line 434
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getRepeatedFieldBuilder() called on an unsupported message type."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;
    .locals 2

    .line 412
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    sget v1, Ll/ۢ֨ۖ;->᩹:I

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    return-object v1
.end method

.method public hasOneof(Ll/ܶۖۖ;)Z
    .locals 1

    .line 307
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasOneof() is not implemented."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic internalMergeFrom(Ll/ۘۜۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->internalMergeFrom(Ll/ۘۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public internalMergeFrom(Ll/ۘۜۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 342
    check-cast p1, Ll/᩻֡ۖ;

    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public markClean()V
    .locals 2

    .line 458
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([B)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom([B)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3}, Ll/᩷ۜۖ;->mergeFrom([BII)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILl/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩷ۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BLl/ᩳۘۖ;)Ll/ۖۜۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom([BLl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-super {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/ۡ֡ۖ;)Ll/ۖۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([B)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom([B)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3}, Ll/᩷ۜۖ;->mergeFrom([BII)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILl/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩷ۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BLl/ᩳۘۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom([BLl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([B)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeFrom([B)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BII)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3}, Ll/᩷ۜۖ;->mergeFrom([BII)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BIILl/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩷ۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom([BLl/ᩳۘۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1, p2}, Ll/᩷ۜۖ;->mergeFrom([BLl/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ljava/io/InputStream;)Ll/᩷ۜۖ;
    .locals 0

    .line 532
    invoke-super {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ljava/io/InputStream;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 538
    invoke-super {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom(Ll/ۛۜۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 493
    invoke-super {p0, p1}, Ll/ۖۜۖ;->mergeFrom(Ll/ۛۜۖ;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 500
    invoke-super {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 76
    sget-object v0, Ll/֫ۘۖ;->ۜ:Ll/֫ۘۖ;

    .line 394
    invoke-virtual {p0, p1, v0}, Ll/᩷ۜۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 9

    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    invoke-virtual {p0}, Ll/᩷ۜۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object v6

    .line 1257
    new-instance v7, Ll/᩵֡ۖ;

    invoke-direct {v7, p0}, Ll/᩵֡ۖ;-><init>(Ll/᩷ۜۖ;)V

    .line 1258
    invoke-interface {p0}, Ll/ܳ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v8

    .line 1260
    :cond_0
    invoke-virtual {p1}, Ll/۟ۜۖ;->ܶ()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    move-object v1, v6

    move-object v2, p2

    move-object v3, v8

    move-object v4, v7

    .line 1265
    invoke-static/range {v0 .. v5}, Ll/۠֡ۖ;->֫(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;Ll/ᩳۖۖ;Ll/֨֡ۖ;I)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    if-eqz v6, :cond_2

    .line 406
    invoke-virtual {p0, v6}, Ll/᩷ۜۖ;->setUnknownFieldSetBuilder(Ll/ܳ֨ۖ;)V

    :cond_2
    return-object p0
.end method

.method public mergeFrom(Ll/᩻֡ۖ;)Ll/᩷ۜۖ;
    .locals 1

    .line 347
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/᩷ۜۖ;->mergeFrom(Ll/᩻֡ۖ;Ljava/util/Map;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Ll/᩻֡ۖ;Ljava/util/Map;)Ll/᩷ۜۖ;
    .locals 4

    .line 351
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-interface {p0}, Ll/ܳ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 363
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 364
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 365
    invoke-virtual {v1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 366
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 367
    invoke-interface {p0, v1, v2}, Ll/ܳ֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    goto :goto_1

    .line 369
    :cond_1
    invoke-virtual {v1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v2

    sget-object v3, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v2, v3, :cond_3

    .line 370
    invoke-interface {p0, v1}, Ll/ۘ֡ۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֡ۖ;

    .line 371
    invoke-interface {v2}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 372
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ll/ܳ֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    goto :goto_0

    .line 377
    :cond_2
    invoke-interface {v2}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object v3

    .line 378
    invoke-interface {v3, v2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object v2

    .line 379
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻֡ۖ;

    invoke-interface {v2, v0}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object v0

    .line 380
    invoke-interface {v0}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object v0

    .line 374
    invoke-interface {p0, v1, v0}, Ll/ܳ֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    goto :goto_0

    .line 383
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ll/ܳ֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;

    goto :goto_0

    .line 387
    :cond_4
    invoke-interface {p1}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩷ۜۖ;

    return-object p0

    .line 352
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mergeFrom(Message) can only merge messages of the same type."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public mergeFrom([B)Ll/᩷ۜۖ;
    .locals 0

    .line 505
    invoke-super {p0, p1}, Ll/ۖۜۖ;->mergeFrom([B)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom([BII)Ll/᩷ۜۖ;
    .locals 0

    .line 511
    invoke-super {p0, p1, p2, p3}, Ll/ۖۜۖ;->mergeFrom([BII)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom([BIILl/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 527
    invoke-super {p0, p1, p2, p3, p4}, Ll/ۖۜۖ;->mergeFrom([BIILl/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public mergeFrom([BLl/ᩳۘۖ;)Ll/᩷ۜۖ;
    .locals 0

    .line 517
    invoke-super {p0, p1, p2}, Ll/ۖۜۖ;->mergeFrom([BLl/ᩳۘۖ;)Ll/ۖۜۖ;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۖ;

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;
    .locals 0

    .line 293
    invoke-virtual {p0, p1}, Ll/᩷ۜۖ;->mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩷ۜۖ;

    move-result-object p1

    return-object p1
.end method

.method public mergeUnknownFields(Ll/ۢ֨ۖ;)Ll/᩷ۜۖ;
    .locals 2

    .line 422
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    sget v1, Ll/ۢ֨ۖ;->᩹:I

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    .line 422
    invoke-virtual {v1, p1}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    invoke-virtual {v1}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object p1

    .line 421
    invoke-interface {p0, p1}, Ll/ܳ֡ۖ;->setUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;

    return-object p0
.end method

.method public setUnknownFieldSetBuilder(Ll/ܳ֨ۖ;)V
    .locals 0

    .line 416
    invoke-virtual {p1}, Ll/ܳ֨ۖ;->build()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/ܳ֡ۖ;->setUnknownFields(Ll/ۢ֨ۖ;)Ll/ܳ֡ۖ;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 440
    sget v0, Ll/ۨۚۖ;->֫:I

    .line 103
    invoke-static {}, Ll/ۤۚۖ;->֫()Ll/ۤۚۖ;

    move-result-object v0

    .line 440
    invoke-virtual {v0, p0}, Ll/ۤۚۖ;->֫(Ll/ۘ֡ۖ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
