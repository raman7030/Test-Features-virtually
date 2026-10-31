.class public final Ll/᩷ۘۧ;
.super Ljava/lang/Object;
.source "D8NW"


# instance fields
.field public final ֫:J

.field public final ۜ:Ll/ܳۘۧ;

.field public final ۧ:[I

.field public final ܳ:[I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:[J

.field public final ᩻:[J


# direct methods
.method public constructor <init>(Ll/ܳۘۧ;[J[II[J[IJ)V
    .locals 3

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    array-length v0, p3

    array-length v1, p5

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 60
    array-length v0, p2

    array-length v1, p5

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 61
    array-length v0, p6

    array-length v1, p5

    if-ne v0, v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    .line 63
    iput-object p1, p0, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    .line 64
    iput-object p2, p0, Ll/᩷ۘۧ;->ᩳ:[J

    .line 65
    iput-object p3, p0, Ll/᩷ۘۧ;->ܳ:[I

    .line 66
    iput p4, p0, Ll/᩷ۘۧ;->ܽ:I

    .line 67
    iput-object p5, p0, Ll/᩷ۘۧ;->᩻:[J

    .line 68
    iput-object p6, p0, Ll/᩷ۘۧ;->ۧ:[I

    .line 69
    iput-wide p7, p0, Ll/᩷ۘۧ;->֫:J

    .line 70
    array-length p1, p2

    iput p1, p0, Ll/᩷ۘۧ;->ܿ:I

    .line 71
    array-length p1, p6

    if-lez p1, :cond_3

    .line 72
    array-length p1, p6

    add-int/lit8 p1, p1, -0x1

    aget p2, p6, p1

    const/high16 p3, 0x20000000

    or-int/2addr p2, p3

    aput p2, p6, p1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(J)I
    .locals 2

    .line 103
    iget-object v0, p0, Ll/᩷ۘۧ;->᩻:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->֫([JJZ)I

    move-result p1

    .line 104
    :goto_0
    array-length p2, v0

    if-ge p1, p2, :cond_1

    .line 105
    iget-object p2, p0, Ll/᩷ۘۧ;->ۧ:[I

    aget p2, p2, p1

    and-int/2addr p2, v1

    if-eqz p2, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
