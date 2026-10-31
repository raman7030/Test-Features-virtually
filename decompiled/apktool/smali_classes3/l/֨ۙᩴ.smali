.class public final Ll/֨ۙᩴ;
.super Ll/ۖۙᩴ;
.source "N673"


# static fields
.field public static final h:Ll/ᩴ᩹ᩴ;


# instance fields
.field public final g:Ll/۬᩹ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x7d0

    const/4 v1, 0x1

    .line 2921
    invoke-static {v0, v1, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/֨ۙᩴ;->h:Ll/ᩴ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۤۗᩴ;IILl/۬᩹ᩴ;I)V
    .locals 6

    .line 2971
    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    .line 2973
    iput-object p4, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    return-void
.end method


# virtual methods
.method public final a(Ll/ۤۙᩴ;J)J
    .locals 7

    .line 2978
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    .line 2980
    iget-object v2, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    if-eqz v2, :cond_0

    .line 238
    iget-object p1, p1, Ll/ۤۙᩴ;->a:Ll/ۖۗᩴ;

    .line 2981
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object p1

    .line 2982
    invoke-interface {p1, v2}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    iget-object v2, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    int-to-long v2, p1

    .line 2984
    sget-object p1, Ll/ۖۙᩴ;->f:[J

    cmp-long v4, p2, v2

    if-ltz v4, :cond_1

    iget v4, p0, Ll/ۖۙᩴ;->b:I

    aget-wide v4, p1, v4

    add-long/2addr v2, v4

    cmp-long v6, p2, v2

    if-gez v6, :cond_1

    .line 2986
    rem-long/2addr v0, v4

    return-wide v0

    .line 2989
    :cond_1
    iget p2, p0, Ll/ۖۙᩴ;->c:I

    aget-wide p2, p1, p2

    rem-long/2addr v0, p2

    return-wide v0
.end method

.method public final b(Ll/ۗۙᩴ;)Z
    .locals 1

    .line 270
    iget-boolean v0, p1, Ll/ۗۙᩴ;->c:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3064
    :cond_0
    invoke-super {p0, p1}, Ll/ۖۙᩴ;->b(Ll/ۗۙᩴ;)Z

    move-result p1

    return p1
.end method

.method public final c(Ll/ۗۙᩴ;JII)I
    .locals 9

    .line 2995
    iget-object v0, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_2

    .line 167
    invoke-virtual {p1}, Ll/ۗۙᩴ;->c()Ll/ܽۙᩴ;

    move-result-object v1

    iget-object v1, v1, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    if-nez v1, :cond_0

    .line 169
    iget-object v1, p1, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    .line 1501
    iget-object v1, v1, Ll/ۛ᩶ᩴ;->e:Ll/ۖ᩶ᩴ;

    if-nez v1, :cond_0

    .line 171
    sget-object v1, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    .line 2997
    :cond_0
    invoke-interface {v1, v0}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-interface {v0, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v0

    .line 3001
    new-instance v8, Ll/ۚۙᩴ;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Ll/ۚۙᩴ;-><init>(Ll/֨ۙᩴ;Ll/ۗۙᩴ;JII)V

    .line 401
    iget-object v1, p1, Ll/ۗۙᩴ;->e:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 402
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p1, Ll/ۗۙᩴ;->e:Ljava/util/ArrayList;

    .line 404
    :cond_1
    iget-object v1, p1, Ll/ۗۙᩴ;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    sub-int v1, p5, p4

    .line 3011
    iget v2, p0, Ll/ۖۙᩴ;->b:I

    if-ne v1, v2, :cond_4

    const-wide/16 v3, 0x0

    cmp-long v1, p2, v3

    if-ltz v1, :cond_4

    .line 3012
    sget-object v1, Ll/ۖۙᩴ;->f:[J

    aget-wide v2, v1, v2

    int-to-long v4, v0

    .line 3013
    rem-long v6, v4, v2

    sub-long v6, v4, v6

    if-lez v0, :cond_3

    add-long/2addr v6, p2

    goto :goto_1

    :cond_3
    sub-long/2addr v6, p2

    :goto_1
    move-wide p2, v6

    cmp-long v0, p2, v4

    if-gez v0, :cond_4

    add-long/2addr p2, v2

    :cond_4
    move-wide v2, p2

    .line 3024
    iget-object v1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    move-object v0, p1

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result p1

    return p1
.end method

.method public final d()Ll/ۖۙᩴ;
    .locals 8

    .line 3034
    iget v0, p0, Ll/ۖۙᩴ;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 3037
    :cond_0
    new-instance v0, Ll/֨ۙᩴ;

    iget-object v6, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    const/4 v7, -0x1

    iget-object v3, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    iget v4, p0, Ll/ۖۙᩴ;->b:I

    iget v5, p0, Ll/ۖۙᩴ;->c:I

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/֨ۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/۬᩹ᩴ;I)V

    return-object v0
.end method

.method public final e(I)Ll/ۖۙᩴ;
    .locals 7

    .line 3048
    new-instance v6, Ll/֨ۙᩴ;

    iget v0, p0, Ll/ۖۙᩴ;->e:I

    add-int v5, v0, p1

    iget-object v1, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    iget v2, p0, Ll/ۖۙᩴ;->b:I

    iget v3, p0, Ll/ۖۙᩴ;->c:I

    iget-object v4, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/֨ۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/۬᩹ᩴ;I)V

    return-object v6
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 3070
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۙᩴ;->g:Ll/۬᩹ᩴ;

    invoke-static {v1, v0}, Ll/ۧ۫ᩴ;->requireNonNullElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ReducedValue("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۖۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۖۙᩴ;->b:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۖۙᩴ;->c:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
