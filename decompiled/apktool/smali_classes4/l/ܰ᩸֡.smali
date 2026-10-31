.class public final Ll/ܰ᩸֡;
.super Ll/֫᩶֡;
.source "F5F2"

# interfaces
.implements Ll/᩷᩶֡;


# static fields
.field public static final ܿ:Ll/۟᩹֡;


# instance fields
.field public ۧ:S

.field public ܽ:B

.field public ᩳ:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/᩺᩸֡;

    .line 92
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/ܰ᩸֡;->ܿ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;[BI)V
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    add-int/lit8 p1, p3, 0x1

    .line 65
    aget-byte p1, p2, p1

    and-int/lit8 v0, p1, 0xf

    int-to-byte v0, v0

    iput-byte v0, p0, Ll/ܰ᩸֡;->ܽ:B

    .line 66
    invoke-static {p1}, Ll/ۨܺܺ;->֫(B)B

    move-result p1

    iput-byte p1, p0, Ll/ܰ᩸֡;->ᩳ:B

    add-int/lit8 p3, p3, 0x2

    .line 67
    invoke-static {p3, p2}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result p1

    int-to-short p1, p1

    iput-short p1, p0, Ll/ܰ᩸֡;->ۧ:S

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 81
    iget-byte v0, p0, Ll/ܰ᩸֡;->ܽ:B

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 77
    sget-object v0, Ll/᩻᩸֡;->ܿ֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 1

    .line 71
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 72
    iget-byte p2, p0, Ll/ܰ᩸֡;->ᩳ:B

    shl-int/lit8 p2, p2, 0x4

    iget-byte v0, p0, Ll/ܰ᩸֡;->ܽ:B

    or-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 73
    iget-short p2, p0, Ll/ܰ᩸֡;->ۧ:S

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method
