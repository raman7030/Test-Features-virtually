.class public final Ll/ۜܽ᩵;
.super Ll/᩷֫᩵;
.source "N673"


# instance fields
.field public final s:Z

.field public final t:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ll/ۨ֫᩵;)V
    .locals 2

    .line 111
    sget v0, Ll/۟۟ᩴ;->q:I

    sget v1, Ll/۟۟ᩴ;->o:I

    or-int/2addr v0, v1

    .line 94
    invoke-direct {p0, p1, v0}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    const/4 p1, 0x1

    .line 113
    iput-boolean p1, p0, Ll/ۜܽ᩵;->s:Z

    .line 357
    sget-object p1, Ll/۟ۤᩴ;->INSTANCE:Ll/۟ۤᩴ;

    .line 117
    iput-object p1, p0, Ll/ۜܽ᩵;->t:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ll/ۨ֫᩵;Ljava/util/Comparator;)V
    .locals 2

    .line 126
    sget v0, Ll/۟۟ᩴ;->q:I

    sget v1, Ll/۟۟ᩴ;->p:I

    or-int/2addr v0, v1

    .line 94
    invoke-direct {p0, p1, v0}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    const/4 p1, 0x0

    .line 128
    iput-boolean p1, p0, Ll/ۜܽ᩵;->s:Z

    .line 129
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Comparator;

    iput-object p1, p0, Ll/ۜܽ᩵;->t:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 2

    .line 152
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    move-object v1, p1

    check-cast v1, Ll/۫᩺ᩴ;

    .line 509
    iget v1, v1, Ll/۫᩺ᩴ;->m:I

    .line 152
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۜܽ᩵;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 153
    invoke-virtual {p1, p2, v0, p3}, Ll/ۡ᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    .line 157
    invoke-virtual {p1, p2, v0, p3}, Ll/ۡ᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    invoke-interface {p1, p3}, Ll/ۚ۟ᩴ;->m(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    .line 160
    iget-object p2, p0, Ll/ۜܽ᩵;->t:Ljava/util/Comparator;

    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 148
    new-instance p2, Ll/֡֫᩵;

    invoke-direct {p2, p1}, Ll/֡֫᩵;-><init>([Ljava/lang/Object;)V

    return-object p2
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 134
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۜܽ᩵;->s:Z

    if-eqz v0, :cond_0

    return-object p2

    .line 140
    :cond_0
    sget-object v0, Ll/۟۟ᩴ;->SIZED:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 141
    new-instance p1, Ll/ۤᩳ᩵;

    iget-object v0, p0, Ll/ۜܽ᩵;->t:Ljava/util/Comparator;

    .line 348
    invoke-direct {p1, p2, v0}, Ll/ܰ۟ᩴ;-><init>(Ll/֡ᩳ᩵;Ljava/util/Comparator;)V

    return-object p1

    .line 143
    :cond_1
    new-instance p1, Ll/֨ܽ᩵;

    iget-object v0, p0, Ll/ۜܽ᩵;->t:Ljava/util/Comparator;

    .line 388
    invoke-direct {p1, p2, v0}, Ll/ܰ۟ᩴ;-><init>(Ll/֡ᩳ᩵;Ljava/util/Comparator;)V

    return-object p1
.end method
