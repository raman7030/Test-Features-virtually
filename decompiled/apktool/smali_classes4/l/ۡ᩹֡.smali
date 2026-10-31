.class public final Ll/ۡ᩹֡;
.super Ll/ܽ᩶֡;
.source "B65P"

# interfaces
.implements Ll/᩷᩶֡;


# static fields
.field public static final ᩳ:Ll/۟᩹֡;


# instance fields
.field public ܽ:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/ۢ᩹֡;

    .line 78
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/ۡ᩹֡;->ᩳ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܽ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V

    add-int/lit8 p4, p4, 0x1

    .line 57
    aget-byte p1, p3, p4

    iput-byte p1, p0, Ll/ۡ᩹֡;->ܽ:B

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;SLl/ۨۙ֡;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p3}, Ll/ܽ᩶֡;-><init>(Ll/᩻᩶֡;Ll/ۚۙ֡;)V

    const/16 p1, 0x100

    if-ge p2, p1, :cond_0

    int-to-byte p1, p2

    .line 51
    iput-byte p1, p0, Ll/ۡ᩹֡;->ܽ:B

    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The register number must be less than v256"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 75
    iget-byte v0, p0, Ll/ۡ᩹֡;->ܽ:B

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ֫(I[B)I
    .locals 0

    add-int/lit8 p1, p1, 0x2

    .line 67
    invoke-static {p1, p2}, Ll/ۨܺܺ;->֫(I[B)I

    move-result p1

    return p1
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 71
    sget-object v0, Ll/᩻᩸֡;->ۡ֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 0

    .line 61
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 62
    iget-byte p2, p0, Ll/ۡ᩹֡;->ܽ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 63
    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۚۙ֡;->ܿ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ܽ(I)V

    return-void
.end method
