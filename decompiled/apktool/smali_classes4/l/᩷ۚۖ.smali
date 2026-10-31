.class public final Ll/᩷ۚۖ;
.super Ljava/lang/Object;
.source "X93Y"


# static fields
.field public static final ֫:Ll/ۜۚۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 28
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    sput-object v0, Ll/᩷ۚۖ;->֫:Ll/ۜۚۖ;

    const/4 v0, 0x4

    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v1, 0x1

    aput-object v2, v0, v1

    aput-object v4, v0, v3

    const-string v1, ""

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "%d.%d.%d%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    const-class v0, Ll/᩷ۚۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۜۚۖ;Ljava/lang/String;)V
    .locals 6

    const-string v0, "TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK"

    .line 126
    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "true"

    if-eqz v1, :cond_0

    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 126
    :cond_0
    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x4

    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v1, 0x1

    aput-object v2, v0, v1

    aput-object v4, v0, v3

    const-string v1, ""

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "%d.%d.%d%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    sget-object v0, Ll/᩷ۚۖ;->֫:Ll/ۜۚۖ;

    if-ne p0, v0, :cond_2

    return-void

    .line 74
    :cond_2
    new-instance v1, Ll/᩻ۚۖ;

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Detected mismatched Protobuf Gencode/Runtime domains when loading "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": gencode "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", runtime "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ". Cross-domain usage of Protobuf is not supported."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 115
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 75
    throw v1
.end method
