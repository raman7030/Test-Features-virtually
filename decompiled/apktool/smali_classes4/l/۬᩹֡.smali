.class public final Ll/۬᩹֡;
.super Ll/֫᩶֡;
.source "L69I"


# static fields
.field public static final ܿ:Ll/۟᩹֡;


# instance fields
.field public ۧ:S

.field public ܽ:B

.field public ᩳ:S


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/ۗ᩹֡;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/۬᩹֡;->ܿ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    add-int/lit8 p1, p3, 0x1

    .line 74
    aget-byte p1, p2, p1

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/۬᩹֡;->ܽ:B

    add-int/lit8 p1, p3, 0x2

    .line 75
    invoke-static {p1, p2}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result p1

    int-to-short p1, p1

    iput-short p1, p0, Ll/۬᩹֡;->ۧ:S

    add-int/lit8 p3, p3, 0x4

    .line 76
    invoke-static {p3, p2}, Ll/ۨܺܺ;->ܽ(I[B)I

    move-result p1

    int-to-short p1, p1

    iput-short p1, p0, Ll/۬᩹֡;->ᩳ:S

    return-void
.end method


# virtual methods
.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 87
    sget-object v0, Ll/᩻᩸֡;->֨֫:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 0

    .line 80
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 81
    iget-byte p2, p0, Ll/۬᩹֡;->ܽ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 82
    iget-short p2, p0, Ll/۬᩹֡;->ۧ:S

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 83
    iget-short p2, p0, Ll/۬᩹֡;->ᩳ:S

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method
