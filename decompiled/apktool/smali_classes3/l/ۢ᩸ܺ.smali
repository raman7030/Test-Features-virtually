.class public final Ll/ۢ᩸ܺ;
.super Ljava/lang/Object;
.source "33QT"


# static fields
.field public static final ֫:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 278
    const-class v0, Ll/ۖ᩸ܺ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۢ᩸ܺ;->֫:Ljava/util/logging/Logger;

    return-void
.end method
