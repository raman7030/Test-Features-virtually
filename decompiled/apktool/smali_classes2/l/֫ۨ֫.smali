.class public final Ll/֫ۨ֫;
.super Ljava/lang/Object;
.source "P8JS"

# interfaces
.implements Ll/ᩴ᩸֫;


# static fields
.field public static final ܽ:Z


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "Amazon"

    .line 38
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "AFTM"

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AFTB"

    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/֫ۨ֫;->ܽ:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;[B)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Ll/֫ۨ֫;->ۧ:Ljava/util/UUID;

    .line 75
    iput-object p2, p0, Ll/֫ۨ֫;->֫:[B

    return-void
.end method
