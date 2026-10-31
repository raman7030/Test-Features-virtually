.class public abstract Lbin/mt/json/JSONValue;
.super Ljava/lang/Object;
.source "JSONValue.java"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asArray()Lbin/mt/json/JSONArray;
    .locals 3

    .line 158
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not an array: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asBoolean()Z
    .locals 3

    .line 242
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a boolean: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asDouble()D
    .locals 3

    .line 220
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a number: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asFloat()F
    .locals 3

    .line 205
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a number: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asInt()I
    .locals 3

    .line 174
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a number: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asLong()J
    .locals 3

    .line 190
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a number: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asObject()Lbin/mt/json/JSONObject;
    .locals 3

    .line 147
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not an object: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public asString()Ljava/lang/String;
    .locals 3

    .line 231
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 323
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 328
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isArray()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isBoolean()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFalse()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNull()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNumber()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isObject()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isString()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isTrue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 290
    sget-object v0, Lbin/mt/json/WriterConfig;->MINIMAL:Lbin/mt/json/WriterConfig;

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONValue;->toString(Lbin/mt/json/WriterConfig;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Lbin/mt/json/WriterConfig;)Ljava/lang/String;
    .locals 1

    .line 300
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 302
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONValue;->writeTo(Ljava/io/Writer;Lbin/mt/json/WriterConfig;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 305
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract write(Ll/֫᩻ܳ;)V
.end method

.method public writeTo(Ljava/io/Writer;)V
    .locals 1

    .line 255
    sget-object v0, Lbin/mt/json/WriterConfig;->MINIMAL:Lbin/mt/json/WriterConfig;

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONValue;->writeTo(Ljava/io/Writer;Lbin/mt/json/WriterConfig;)V

    return-void
.end method

.method public writeTo(Ljava/io/Writer;Lbin/mt/json/WriterConfig;)V
    .locals 2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 275
    new-instance v0, Ll/ܿ᩻ܳ;

    const/16 v1, 0x80

    invoke-direct {v0, p1, v1}, Ll/ܿ᩻ܳ;-><init>(Ljava/io/Writer;I)V

    .line 276
    invoke-virtual {p2, v0}, Lbin/mt/json/WriterConfig;->createWriter(Ljava/io/Writer;)Ll/֫᩻ܳ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONValue;->write(Ll/֫᩻ܳ;)V

    .line 277
    invoke-virtual {v0}, Ll/ܿ᩻ܳ;->flush()V

    return-void

    .line 273
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "config is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 270
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "writer is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
