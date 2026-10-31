.class public final Ll/ܶ᩸֡;
.super Ll/ܽ᩶֡;
.source "M59E"

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
    new-instance v0, Ll/۠᩸֡;

    .line 91
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/ܶ᩸֡;->ᩳ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܽ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)V

    .line 64
    sget-object p1, Ll/᩻᩶֡;->ۙܿ:Ll/᩻᩶֡;

    if-ne p2, p1, :cond_1

    .line 65
    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/᩺ۙ֡;

    invoke-virtual {p1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p2, 0x4c

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Only class references can be used with the new-instance opcode"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    add-int/lit8 p4, p4, 0x1

    .line 70
    aget-byte p1, p3, p4

    iput-byte p1, p0, Ll/ܶ᩸֡;->ܽ:B

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;SLl/ۚۙ֡;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1, p3}, Ll/ܽ᩶֡;-><init>(Ll/᩻᩶֡;Ll/ۚۙ֡;)V

    const/16 v0, 0x100

    if-ge p2, v0, :cond_2

    .line 51
    sget-object v0, Ll/᩻᩶֡;->ۙܿ:Ll/᩻᩶֡;

    if-ne p1, v0, :cond_1

    .line 53
    check-cast p3, Ll/᩺ۙ֡;

    invoke-virtual {p3}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p3, 0x4c

    if-ne p1, p3, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Only class references can be used with the new-instance opcode"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    int-to-byte p1, p2

    .line 58
    iput-byte p1, p0, Ll/ܶ᩸֡;->ܽ:B

    return-void

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The register number must be less than v256"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 88
    iget-byte v0, p0, Ll/ܶ᩸֡;->ܽ:B

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 84
    sget-object v0, Ll/᩻᩸֡;->ܰ:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 2

    .line 74
    sget-object p2, Ll/᩻᩶֡;->ᩳۧ:Ll/᩻᩶֡;

    iget-object v0, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    if-ne v0, p2, :cond_1

    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۚۙ֡;->ܿ()I

    move-result p2

    const v1, 0xffff

    if-gt p2, v1, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "String offset is too large for const-string. Use string-const/jumbo instead."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_1
    :goto_0
    iget-byte p2, v0, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 79
    iget-byte p2, p0, Ll/ܶ᩸֡;->ܽ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 80
    invoke-virtual {p0}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۚۙ֡;->ܿ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method
