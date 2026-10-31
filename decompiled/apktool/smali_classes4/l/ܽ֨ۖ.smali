.class public final Ll/ܽ֨ۖ;
.super Ljava/lang/Object;
.source "Z9RL"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Ll/ܽ֨ۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
