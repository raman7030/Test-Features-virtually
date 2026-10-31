.class public final Ll/᩷᩸֡;
.super Ll/֫᩶֡;
.source "G67N"

# interfaces
.implements Ll/ܳ᩶֡;


# static fields
.field public static final ܽ:Ll/۟᩹֡;


# instance fields
.field public ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ll/ۜ᩸֡;

    .line 87
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    sput-object v0, Ll/᩷᩸֡;->ܽ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    .line 43
    iput p2, p0, Ll/᩷᩸֡;->ۧ:I

    if-eqz p2, :cond_0

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The address offset cannot be 0. Use goto/32 instead."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    add-int/lit8 p3, p3, 0x1

    .line 58
    aget-byte p1, p2, p3

    iput p1, p0, Ll/᩷᩸֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 80
    sget-object v0, Ll/᩻᩸֡;->۬:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 1

    .line 63
    iget p2, p0, Ll/᩷᩸֡;->ۧ:I

    if-eqz p2, :cond_1

    const/16 v0, -0x80

    if-lt p2, v0, :cond_0

    const/16 v0, 0x7f

    if-gt p2, v0, :cond_0

    .line 71
    iget-object v0, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte v0, v0, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 72
    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    return-void

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The address offset is out of range. It must be in [-128,-1] or [1, 127]"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The address offset cannot be 0. Use goto/32 instead"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 84
    iget v0, p0, Ll/᩷᩸֡;->ۧ:I

    return v0
.end method
