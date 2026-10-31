.class public final Ll/ۨ᩸֡;
.super Ll/ܽ᩶֡;
.source "25GH"

# interfaces
.implements Ll/᩷᩶֡;


# static fields
.field public static final ܿ:Ll/۟᩹֡;


# instance fields
.field public ܽ:B

.field public ᩳ:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/ۛ᩸֡;

    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/ۨ᩸֡;->ܿ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܽ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V

    add-int/lit8 p4, p4, 0x1

    .line 60
    aget-byte p1, p3, p4

    and-int/lit8 p2, p1, 0xf

    int-to-byte p2, p2

    iput-byte p2, p0, Ll/ۨ᩸֡;->ܽ:B

    .line 61
    invoke-static {p1}, Ll/ۨܺܺ;->֫(B)B

    move-result p1

    iput-byte p1, p0, Ll/ۨ᩸֡;->ᩳ:B

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;BBLl/ۚۙ֡;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p4}, Ll/ܽ᩶֡;-><init>(Ll/᩻᩶֡;Ll/ۚۙ֡;)V

    const/16 p1, 0x10

    if-ge p2, p1, :cond_0

    if-ge p3, p1, :cond_0

    .line 53
    iput-byte p2, p0, Ll/ۨ᩸֡;->ܽ:B

    .line 54
    iput-byte p3, p0, Ll/ۨ᩸֡;->ᩳ:B

    return-void

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The register number must be less than v16"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 75
    iget-byte v0, p0, Ll/ۨ᩸֡;->ܽ:B

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 71
    sget-object v0, Ll/᩻᩸֡;->ᩳ֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 1

    .line 65
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 66
    iget-byte p2, p0, Ll/ۨ᩸֡;->ᩳ:B

    shl-int/lit8 p2, p2, 0x4

    iget-byte v0, p0, Ll/ۨ᩸֡;->ܽ:B

    or-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 67
    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۚۙ֡;->ܿ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 79
    iget-byte v0, p0, Ll/ۨ᩸֡;->ᩳ:B

    return v0
.end method
