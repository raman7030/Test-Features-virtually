.class public final Ll/֨ۨ֫;
.super Ll/֡ᩳۧ;
.source "A7N6"


# instance fields
.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/۬᩵֫;[I)V
    .locals 1

    .line 67
    invoke-direct {p0, p1, p2}, Ll/֡ᩳۧ;-><init>(Ll/۬᩵֫;[I)V

    const/4 v0, 0x0

    .line 1075
    aget p2, p2, v0

    invoke-virtual {p1, p2}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֡ᩳۧ;->֫(Ll/۠ᩴ֫;)I

    move-result p1

    iput p1, p0, Ll/֨ۨ֫;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1102
    iget v0, p0, Ll/֨ۨ֫;->᩻:I

    return v0
.end method

.method public final ֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V
    .locals 0

    .line 1085
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    .line 1086
    iget p3, p0, Ll/֨ۨ֫;->᩻:I

    invoke-virtual {p0, p3, p1, p2}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 1090
    :cond_0
    iget p3, p0, Ll/֡ᩳۧ;->ܿ:I

    :cond_1
    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_2

    .line 1091
    invoke-virtual {p0, p3, p1, p2}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result p4

    if-nez p4, :cond_1

    .line 1092
    iput p3, p0, Ll/֨ۨ֫;->᩻:I

    return-void

    .line 1097
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
