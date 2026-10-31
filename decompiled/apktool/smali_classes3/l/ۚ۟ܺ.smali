.class public final Ll/ۚ۟ܺ;
.super Ll/۠۟ܺ;
.source "XAXR"


# static fields
.field public static final ۧ:Ll/ۚ۟ܺ;

.field public static final ܽ:Ll/ۚ۟ܺ;


# instance fields
.field public final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Ll/ۚ۟ܺ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۚ۟ܺ;-><init>(I)V

    sput-object v0, Ll/ۚ۟ܺ;->ܽ:Ll/ۚ۟ܺ;

    .line 36
    new-instance v0, Ll/ۚ۟ܺ;

    const/high16 v1, -0x80000000

    invoke-direct {v0, v1}, Ll/ۚ۟ܺ;-><init>(I)V

    sput-object v0, Ll/ۚ۟ܺ;->ۧ:Ll/ۚ۟ܺ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/۠۟ܺ;-><init>()V

    .line 39
    iput p1, p0, Ll/ۚ۟ܺ;->֫:I

    return-void
.end method

.method public static ֫(II)Ll/ۚ۟ܺ;
    .locals 1

    .line 43
    new-instance v0, Ll/ۚ۟ܺ;

    mul-int p0, p0, p1

    invoke-direct {v0, p0}, Ll/ۚ۟ܺ;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 53
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "n"

    iget v2, p0, Ll/ۚ۟ܺ;->֫:I

    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 48
    iget v0, p0, Ll/ۚ۟ܺ;->֫:I

    return v0
.end method
