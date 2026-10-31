.class public abstract Ll/ܶ֨֫;
.super Ljava/lang/Object;
.source "X8SG"


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 486
    iput p1, p0, Ll/ܶ֨֫;->֫:I

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    .line 605
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 p0, p0, 0xff

    int-to-char p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 491
    iget v0, p0, Ll/ܶ֨֫;->֫:I

    invoke-static {v0}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
