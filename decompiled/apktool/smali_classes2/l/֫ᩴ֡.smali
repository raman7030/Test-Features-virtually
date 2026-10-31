.class public final Ll/֫ᩴ֡;
.super Ljava/lang/Object;
.source "62DG"


# static fields
.field public static final ֫:Ljava/lang/String;

.field public static final ۧ:Ljava/lang/String;

.field public static final ܽ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    .line 41
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/֫ᩴ֡;->ۧ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    sput-object v0, Ll/֫ᩴ֡;->֫:Ljava/lang/String;

    const/4 v0, 0x4

    new-array v0, v0, [C

    .line 45
    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ᩴ֡;->ܽ:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x2cs
        0x22s
        0xds
        0xas
    .end array-data
.end method

.method public static synthetic ֫()[C
    .locals 1

    .line 34
    sget-object v0, Ll/֫ᩴ֡;->ܽ:[C

    return-object v0
.end method

.method public static synthetic ۧ()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Ll/֫ᩴ֡;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic ܽ()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Ll/֫ᩴ֡;->֫:Ljava/lang/String;

    return-object v0
.end method
