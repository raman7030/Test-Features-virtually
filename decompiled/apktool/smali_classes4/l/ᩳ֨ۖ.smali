.class public final Ll/ᩳ֨ۖ;
.super Ljava/lang/RuntimeException;
.source "Q9O5"


# static fields
.field public static final serialVersionUID:J = -0x679fdd3b29a24eb3L


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    .line 28
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫᩵ۖ;
    .locals 2

    .line 56
    new-instance v0, Ll/֫᩵ۖ;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
