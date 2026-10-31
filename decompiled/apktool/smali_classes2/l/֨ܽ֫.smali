.class public abstract Ll/֨ܽ֫;
.super Ljava/lang/Object;
.source "7B5N"

# interfaces
.implements Ll/ۛۧ֫;


# static fields
.field public static final ֡:Ll/ۚܽ֫;

.field public static final ۖ:Ll/ۚܽ֫;

.field public static final ۘ:Ll/ۚܽ֫;

.field public static final ۚ:Ll/ۚܽ֫;

.field public static final ܺ:Ll/ۚܽ֫;

.field public static final ᩴ:Ll/ۚܽ֫;

.field public static final ᩵:Ll/ۚܽ֫;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۜ:Ljava/lang/Object;

.field public ۡ:F

.field public ۢ:F

.field public ۧ:J

.field public ܳ:Z

.field public ܽ:F

.field public final ܿ:Ll/ܶܽ֫;

.field public ᩳ:F

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Ll/ܳܽ֫;

    const-string v1, "translationX"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 57
    sput-object v0, Ll/֨ܽ֫;->ۚ:Ll/ۚܽ֫;

    .line 72
    new-instance v0, Ll/᩻ܽ֫;

    const-string v1, "translationY"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 87
    new-instance v0, Ll/ۜܽ֫;

    const-string v1, "translationZ"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 102
    new-instance v0, Ll/᩷ܽ֫;

    const-string v1, "scaleX"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 102
    sput-object v0, Ll/֨ܽ֫;->᩵:Ll/ۚܽ֫;

    .line 117
    new-instance v0, Ll/ۢܽ֫;

    const-string v1, "scaleY"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 117
    sput-object v0, Ll/֨ܽ֫;->֡:Ll/ۚܽ֫;

    .line 132
    new-instance v0, Ll/ۡܽ֫;

    const-string v1, "rotation"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 132
    sput-object v0, Ll/֨ܽ֫;->ۖ:Ll/ۚܽ֫;

    .line 147
    new-instance v0, Ll/ܺܽ֫;

    const-string v1, "rotationX"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 147
    sput-object v0, Ll/֨ܽ֫;->ۘ:Ll/ۚܽ֫;

    .line 162
    new-instance v0, Ll/ۖܽ֫;

    const-string v1, "rotationY"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 162
    sput-object v0, Ll/֨ܽ֫;->ᩴ:Ll/ۚܽ֫;

    .line 177
    new-instance v0, Ll/ۘܽ֫;

    const-string v1, "x"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 192
    new-instance v0, Ll/֫ܽ֫;

    const-string v1, "y"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 207
    new-instance v0, Ll/ۧܽ֫;

    const-string v1, "z"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 222
    new-instance v0, Ll/ܽܽ֫;

    const-string v1, "alpha"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 222
    sput-object v0, Ll/֨ܽ֫;->ܺ:Ll/ۚܽ֫;

    .line 238
    new-instance v0, Ll/ᩳܽ֫;

    const-string v1, "scrollX"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    .line 253
    new-instance v0, Ll/ܿܽ֫;

    const-string v1, "scrollY"

    .line 50
    invoke-direct {v0, v1}, Ll/ܶܽ֫;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ll/ܶܽ֫;)V
    .locals 2

    .line 356
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 289
    iput v0, p0, Ll/֨ܽ֫;->ۡ:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 292
    iput v0, p0, Ll/֨ܽ֫;->ۢ:F

    const/4 v0, 0x0

    .line 296
    iput-boolean v0, p0, Ll/֨ܽ֫;->᩻:Z

    .line 305
    iput-boolean v0, p0, Ll/֨ܽ֫;->ܳ:Z

    const v0, -0x800001

    .line 309
    iput v0, p0, Ll/֨ܽ֫;->ܽ:F

    const-wide/16 v0, 0x0

    .line 312
    iput-wide v0, p0, Ll/֨ܽ֫;->ۧ:J

    .line 317
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨ܽ֫;->֫:Ljava/util/ArrayList;

    .line 320
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨ܽ֫;->᩷:Ljava/util/ArrayList;

    .line 357
    iput-object p1, p0, Ll/֨ܽ֫;->ۜ:Ljava/lang/Object;

    .line 358
    iput-object p2, p0, Ll/֨ܽ֫;->ܿ:Ll/ܶܽ֫;

    .line 359
    sget-object p1, Ll/֨ܽ֫;->ۖ:Ll/ۚܽ֫;

    if-eq p2, p1, :cond_4

    sget-object p1, Ll/֨ܽ֫;->ۘ:Ll/ۚܽ֫;

    if-eq p2, p1, :cond_4

    sget-object p1, Ll/֨ܽ֫;->ᩴ:Ll/ۚܽ֫;

    if-ne p2, p1, :cond_0

    goto :goto_1

    .line 362
    :cond_0
    sget-object p1, Ll/֨ܽ֫;->ܺ:Ll/ۚܽ֫;

    const/high16 v0, 0x3b800000    # 0.00390625f

    if-ne p2, p1, :cond_1

    .line 363
    iput v0, p0, Ll/֨ܽ֫;->ᩳ:F

    return-void

    .line 364
    :cond_1
    sget-object p1, Ll/֨ܽ֫;->᩵:Ll/ۚܽ֫;

    if-eq p2, p1, :cond_3

    sget-object p1, Ll/֨ܽ֫;->֡:Ll/ۚܽ֫;

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 367
    iput p1, p0, Ll/֨ܽ֫;->ᩳ:F

    return-void

    .line 365
    :cond_3
    :goto_0
    iput v0, p0, Ll/֨ܽ֫;->ᩳ:F

    return-void

    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 361
    iput p1, p0, Ll/֨ܽ֫;->ᩳ:F

    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 2

    .line 703
    iget v0, p0, Ll/֨ܽ֫;->ᩳ:F

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float v0, v0, v1

    return v0
.end method

.method public final ֫(F)V
    .locals 2

    .line 690
    iget-object v0, p0, Ll/֨ܽ֫;->ܿ:Ll/ܶܽ֫;

    iget-object v1, p0, Ll/֨ܽ֫;->ۜ:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ll/ܶܽ֫;->setValue(Ljava/lang/Object;F)V

    const/4 p1, 0x0

    .line 691
    :goto_0
    iget-object v0, p0, Ll/֨ܽ֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    .line 692
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 693
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܽ֫;

    iget v1, p0, Ll/֨ܽ֫;->ۢ:F

    invoke-interface {v0, v1}, Ll/֡ܽ֫;->֫(F)V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 547
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :cond_2
    :goto_1
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    .line 548
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 549
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ֫(Ll/᩵ܽ֫;)V
    .locals 2

    .line 445
    iget-object v0, p0, Ll/֨ܽ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 446
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(J)Z
    .locals 6

    .line 639
    iget-wide v0, p0, Ll/֨ܽ֫;->ۧ:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    .line 641
    iput-wide p1, p0, Ll/֨ܽ֫;->ۧ:J

    .line 642
    iget p1, p0, Ll/֨ܽ֫;->ۢ:F

    invoke-virtual {p0, p1}, Ll/֨ܽ֫;->֫(F)V

    return v2

    :cond_0
    sub-long v0, p1, v0

    .line 646
    iput-wide p1, p0, Ll/֨ܽ֫;->ۧ:J

    .line 647
    invoke-virtual {p0, v0, v1}, Ll/֨ܽ֫;->ۧ(J)Z

    move-result p1

    .line 649
    iget p2, p0, Ll/֨ܽ֫;->ۢ:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, Ll/֨ܽ֫;->ۢ:F

    .line 650
    iget v0, p0, Ll/֨ܽ֫;->ܽ:F

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Ll/֨ܽ֫;->ۢ:F

    .line 652
    invoke-virtual {p0, p2}, Ll/֨ܽ֫;->֫(F)V

    if-eqz p1, :cond_5

    .line 674
    iput-boolean v2, p0, Ll/֨ܽ֫;->ܳ:Z

    .line 88
    sget-object p2, Ll/۟ۧ֫;->ܳ:Ljava/lang/ThreadLocal;

    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 89
    new-instance v0, Ll/۟ۧ֫;

    invoke-direct {v0}, Ll/۟ۧ֫;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 91
    :cond_1
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۟ۧ֫;

    .line 675
    invoke-virtual {p2, p0}, Ll/۟ۧ֫;->֫(Ll/֨ܽ֫;)V

    .line 676
    iput-wide v3, p0, Ll/֨ܽ֫;->ۧ:J

    .line 677
    iput-boolean v2, p0, Ll/֨ܽ֫;->᩻:Z

    .line 678
    :goto_0
    iget-object p2, p0, Ll/֨ܽ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 679
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 680
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵ܽ֫;

    invoke-interface {p2}, Ll/᩵ܽ֫;->onAnimationEnd()V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 547
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_4
    :goto_1
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_5

    .line 548
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    .line 549
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    return p1
.end method

.method public final ۧ(F)V
    .locals 0

    .line 379
    iput p1, p0, Ll/֨ܽ֫;->ۢ:F

    const/4 p1, 0x1

    .line 380
    iput-boolean p1, p0, Ll/֨ܽ֫;->᩻:Z

    return-void
.end method

.method public final ۧ(Ll/᩵ܽ֫;)V
    .locals 2

    .line 558
    iget-object v0, p0, Ll/֨ܽ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 v1, 0x0

    .line 560
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public abstract ۧ(J)Z
.end method
