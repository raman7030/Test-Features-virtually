.class public Ll/֫᩵ۖ;
.super Ljava/io/IOException;
.source "W9OU"


# static fields
.field public static final serialVersionUID:J = -0x166db9773d0dffacL


# instance fields
.field public ᩸:Ll/ۡ֡ۖ;


# direct methods
.method public static ۜ()Ll/֫᩵ۖ;
    .locals 2

    .line 145
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Failed to parse the message."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۧ()Ll/֫᩵ۖ;
    .locals 2

    .line 114
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܳ()Ll/֫᩵ۖ;
    .locals 2

    .line 106
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "CodedInputStream encountered a malformed varint."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܽ()Ll/֫᩵ۖ;
    .locals 2

    .line 110
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܿ()Ll/۟ᩴۖ;
    .locals 2

    .line 119
    new-instance v0, Ll/۟ᩴۖ;

    const-string v1, "Protocol message tag had invalid wire type."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩳ()Ll/֫᩵ۖ;
    .locals 2

    .line 149
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "Protocol message had invalid UTF-8."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩷()Ll/֫᩵ۖ;
    .locals 2

    .line 92
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩻()Ll/֫᩵ۖ;
    .locals 2

    .line 100
    new-instance v0, Ll/֫᩵ۖ;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/io/IOException;
    .locals 1

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/io/IOException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final ֫(Ll/ۡ֡ۖ;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/֫᩵ۖ;->᩸:Ll/ۡ֡ۖ;

    return-void
.end method
