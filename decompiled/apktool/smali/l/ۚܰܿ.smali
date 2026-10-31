.class public Ll/ۚܰܿ;
.super Ll/ۗܺ᩷;
.source "C5GL"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ll/۠ۧ֫;
.implements Ll/ۖۢܽ;


# static fields
.field public static final synthetic ۖܽ:I

.field private static final ۖܿ۫:[S


# instance fields
.field public volatile ֡ۧ:Z

.field public ֨ۧ:Ljava/lang/String;

.field public ֫ܽ:Ll/ۗ᩺ܿ;

.field public ۖۧ:Z

.field public ۗۧ:Z

.field public ۘۧ:Ljava/util/concurrent/Executor;

.field public ۙۧ:Landroid/view/View;

.field public ۚۧ:Ll/ܶ᩵ܿ;

.field public ۛۧ:Z

.field public ۜۧ:J

.field public ۜܽ:Ll/᩵֫ܳ;

.field public ۟ۧ:Ljava/lang/String;

.field public ۠ۧ:Landroid/widget/TextView;

.field public ۡۧ:Z

.field public ۡܽ:Ll/ܰ۬;

.field public volatile ۢۧ:Z

.field public ۢܽ:Ll/۠ܰܿ;

.field public ۤۧ:Landroid/view/View;

.field public ۧܽ:Z

.field public ۨۧ:Landroid/view/View;

.field public ۫ۧ:Ll/ܺ۟ܿ;

.field public ۬ۧ:Ll/ܺ۟ܿ;

.field public ܰۧ:Z

.field public ܳۧ:Landroid/animation/ObjectAnimator;

.field public ܳܽ:Landroid/view/View;

.field public ܶۧ:Z

.field public volatile ܺۧ:Z

.field public ܺܽ:Z

.field public ܽܽ:Ll/ܰ۬;

.field public ܿۧ:Ll/֡ܰܿ;

.field public ܿܽ:Ll/ܰ۬;

.field public final ᩳۧ:Ll/ᩴܰܿ;

.field public ᩳܽ:Z

.field public ᩴۧ:Ll/۬ۧ֫;

.field public ᩵ۧ:Ll/ۜܰܿ;

.field public ᩶ۧ:Z

.field public ᩷ۧ:Z

.field public ᩷ܽ:Ll/᩺ܰܿ;

.field public ᩸ۧ:Landroid/view/inputmethod/InputMethodManager;

.field public ᩹ۧ:Ll/᩶ܰܿ;

.field public ᩺ۧ:Z

.field public ᩻ۧ:Ljava/util/concurrent/Executor;

.field public ᩻ܽ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x42

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚܰܿ;->ۖܿ۫:[S

    return-void

    :array_0
    .array-data 2
        0x117as
        0x12ecs
        -0x2das
        -0x38aas
        0x7fcs
        -0x25b7s
        0x1b27s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 49
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 64
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 65
    iput-boolean v0, p0, Ll/ۚܰܿ;->ܶۧ:Z

    const-wide/high16 v1, -0x8000000000000000L

    .line 79
    iput-wide v1, p0, Ll/ۚܰܿ;->ۜۧ:J

    .line 86
    invoke-static {}, Ll/۫᩺ܿ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v1

    iput-object v1, p0, Ll/ۚܰܿ;->᩻ۧ:Ljava/util/concurrent/Executor;

    .line 87
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Ll/ۚܰܿ;->ۘۧ:Ljava/util/concurrent/Executor;

    .line 88
    new-instance v1, Ll/ᩴܰܿ;

    .line 1236
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object v1, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    const/4 v1, 0x0

    .line 1102
    iput-boolean v1, p0, Ll/ۚܰܿ;->᩺ۧ:Z

    .line 1210
    iput-boolean v0, p0, Ll/ۚܰܿ;->ܺܽ:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۚܰܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 757
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ܽ(Z)V

    return-void
.end method

.method public static bridge synthetic ۖ(Ll/ۚܰܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    return-void
.end method

.method public static bridge synthetic ۘ(Ll/ۚܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۚܰܿ;->ܿ֫()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۚܰܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ۚܰܿ;)Ll/۠ܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۚܰܿ;)Ll/᩵֫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚܰܿ;)Ll/ᩴܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    return-object p0
.end method

.method private ۧ(Z)V
    .locals 7

    .line 1079
    iget-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1082
    iput-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    .line 1083
    iget-object v1, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    if-eqz v1, :cond_1

    .line 1084
    invoke-virtual {v1}, Ll/᩵֫ܳ;->֫()V

    .line 1086
    :cond_1
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1}, Ll/ۜܰܿ;->ᩳ()V

    .line 1087
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1}, Ll/ۜܰܿ;->ܽ()Z

    .line 1088
    new-instance v1, Ll/ۗ᩺ܿ;

    iget-boolean v2, p0, Ll/ۚܰܿ;->ۛۧ:Z

    iget-boolean v3, p0, Ll/ۚܰܿ;->ۗۧ:Z

    iget-boolean v4, p0, Ll/ۚܰܿ;->ܶۧ:Z

    iget-object v5, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v6, 0x0

    .line 1171
    invoke-virtual {v5, v6}, Ll/ۜܰܿ;->֫(Ll/ۙۧܳ;)Ll/᩻ܰܿ;

    move-result-object v5

    .line 1089
    invoke-direct {v1, v2, v3, v4, v5}, Ll/ۗ᩺ܿ;-><init>(ZZZLl/᩻ܰܿ;)V

    iput-object v1, p0, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    .line 1090
    iget-object v1, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    .line 1091
    invoke-virtual {v1}, Ll/᩺ܰܿ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1092
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 1093
    :cond_2
    iput-object v6, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    .line 1099
    new-instance p1, Ll/ۖ᩺ܿ;

    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, p0, v6, v0, v1}, Ll/ۖ᩺ܿ;-><init>(Ll/ۚܰܿ;Ljava/lang/String;ZZ)V

    .line 1099
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۚܰܿ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    return-object p0
.end method

.method private ܳ֫()V
    .locals 5

    .line 911
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 930
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 911
    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 913
    :cond_0
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 914
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 916
    iget-object v1, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    if-eqz v1, :cond_1

    .line 917
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    const/4 v1, 0x0

    .line 918
    iput-object v1, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    .line 921
    :cond_1
    iget-object v1, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 922
    iget-object v1, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 923
    iget-object v1, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x2

    new-array v4, v4, [F

    aput v3, v4, v2

    const/4 v2, 0x0

    aput v2, v4, v0

    const-string v0, "translationY"

    invoke-static {v1, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0xc8

    .line 924
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 925
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 926
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    new-instance v1, Ll/ۖܰܿ;

    invoke-direct {v1, p0}, Ll/ۖܰܿ;-><init>(Ll/ۚܰܿ;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 933
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ۚܰܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۚܰܿ;->ܿۧ:Ll/֡ܰܿ;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۚܰܿ;)Ll/֡ܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ܿۧ:Ll/֡ܰܿ;

    return-object p0
.end method

.method private native ܽ(Z)V
.end method

.method public static bridge synthetic ܿ(Ll/ۚܰܿ;)Ll/۬ۧ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    return-object p0
.end method

.method private ܿ֫()V
    .locals 4

    .line 753
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 1166
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳܽܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 754
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 754
    iget-object v1, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    .line 755
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const v1, 0x7f1208cd

    .line 756
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/᩷ܰܿ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ll/᩷ܰܿ;-><init>(Ll/ۗܺ᩷;I)V

    const v3, 0x7f1208c6

    .line 757
    invoke-virtual {v0, v3, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۢܰܿ;

    invoke-direct {v1, p0, v2}, Ll/ۢܰܿ;-><init>(Ll/ۗܺ᩷;I)V

    const v2, 0x7f120319

    .line 758
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 759
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 761
    :cond_0
    invoke-virtual {p0}, Ll/ۚܰܿ;->finish()V

    return-void
.end method

.method private ᩳ(I)V
    .locals 1

    .line 520
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 521
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 522
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    sget-object v0, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    .line 522
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method private ᩳ(Z)V
    .locals 2

    .line 542
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 544
    iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, p1, 0x400

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    or-int/lit16 p1, p1, 0x400

    .line 546
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_1

    .line 548
    :cond_1
    iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, p1, 0x400

    if-nez v1, :cond_2

    :goto_0
    return-void

    :cond_2
    xor-int/lit16 p1, p1, 0x400

    .line 550
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 552
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۚܰܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۚܰܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۚܰܿ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    return-object p0
.end method

.method private ᩻֫()V
    .locals 4

    .line 275
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܰۧ:Z

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 277
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const v1, 0x7f120438

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void

    .line 278
    :cond_0
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۧܽ:Z

    if-eqz v0, :cond_1

    .line 279
    iget-object v0, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const v0, 0x7f120433

    .line 282
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    .line 283
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    iget-boolean v1, p0, Ll/ۚܰܿ;->᩺ۧ:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    const-string v3, " *"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 283
    :cond_2
    iget-object v1, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 3

    const/4 v0, 0x1

    .line 766
    iput-boolean v0, p0, Ll/ۚܰܿ;->֡ۧ:Z

    .line 767
    iget-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 768
    iget-object v1, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    const/4 v2, 0x0

    .line 769
    iput-object v2, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 770
    iput-object v2, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 773
    :try_start_0
    invoke-virtual {v0}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    .line 778
    invoke-virtual {v0}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 780
    :cond_1
    :try_start_1
    invoke-static {v1}, Ll/᩺ܰܿ;->ۧ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 785
    :catch_1
    :cond_2
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 963
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00a3

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 965
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p1, v1}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_0
    const v0, 0x7f0a00a4

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    .line 967
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p1, v2}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_1
    const v0, 0x7f0a00a5

    if-ne p1, v0, :cond_2

    .line 969
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_2
    const v0, 0x7f0a00a6

    if-ne p1, v0, :cond_3

    .line 971
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_3
    const v0, 0x7f0a00a7

    if-ne p1, v0, :cond_4

    .line 973
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_4
    const v0, 0x7f0a00a8

    if-ne p1, v0, :cond_5

    .line 975
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_5
    const v0, 0x7f0a00a9

    if-ne p1, v0, :cond_6

    .line 977
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_6
    const v0, 0x7f0a00aa

    if-ne p1, v0, :cond_7

    .line 979
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_7
    const v0, 0x7f0a00ab

    if-ne p1, v0, :cond_8

    .line 981
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_8
    const v0, 0x7f0a00ac

    if-ne p1, v0, :cond_9

    .line 983
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_9
    const v0, 0x7f0a00ad

    if-ne p1, v0, :cond_a

    .line 985
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_a
    const v0, 0x7f0a00af

    if-ne p1, v0, :cond_b

    .line 987
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_b
    const v0, 0x7f0a00b0

    if-ne p1, v0, :cond_c

    .line 989
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_c
    const v0, 0x7f0a00b2

    if-ne p1, v0, :cond_d

    .line 991
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_d
    const v0, 0x7f0a00b4

    if-ne p1, v0, :cond_e

    .line 993
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xe

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_e
    const v0, 0x7f0a00b7

    if-ne p1, v0, :cond_f

    .line 995
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/16 v0, 0xf

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->ܽ(I)V

    return-void

    :cond_f
    const v0, 0x7f0a017a

    if-ne p1, v0, :cond_11

    .line 997
    iget-boolean p1, p0, Ll/ۚܰܿ;->ۗۧ:Z

    if-eqz p1, :cond_10

    .line 998
    iput-boolean v1, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 999
    iget-object p1, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    const v0, 0x3e99999a    # 0.3f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1000
    invoke-virtual {p0}, Ll/ۚܰܿ;->ܰ()V

    return-void

    .line 1002
    :cond_10
    iput-boolean v2, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 1003
    iget-object p1, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1004
    invoke-direct {p0}, Ll/ۚܰܿ;->ܳ֫()V

    return-void

    :cond_11
    const v0, 0x7f0a025d

    if-ne p1, v0, :cond_12

    .line 1007
    iget-boolean p1, p0, Ll/ۚܰܿ;->ܶۧ:Z

    xor-int/2addr p1, v2

    iput-boolean p1, p0, Ll/ۚܰܿ;->ܶۧ:Z

    .line 1008
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 922
    iget-object p1, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p1}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    .line 1008
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 926
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۜ()I

    move-result v0

    .line 1008
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 930
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ۡ()Z

    move-result v1

    .line 1008
    iget-object v2, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 934
    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ᩳ()I

    move-result v2

    .line 1008
    invoke-virtual {p0, p1, v0, v2, v1}, Ll/ۚܰܿ;->֫(IIIZ)V

    :cond_12
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 527
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 528
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 529
    iget-object p1, p0, Ll/ۚܰܿ;->ܳܽ:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 530
    iget-object p1, p0, Ll/ۚܰܿ;->۬ۧ:Ll/ܺ۟ܿ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ܿ;->֫(I)V

    .line 531
    iget-object p1, p0, Ll/ۚܰܿ;->۫ۧ:Ll/ܺ۟ܿ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ܿ;->֫(I)V

    .line 532
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(Z)V

    return-void

    .line 534
    :cond_0
    iget-object p1, p0, Ll/ۚܰܿ;->ܳܽ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 535
    iget-object p1, p0, Ll/ۚܰܿ;->۬ۧ:Ll/ܺ۟ܿ;

    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Ll/ܺ۟ܿ;->֫(I)V

    .line 536
    iget-object p1, p0, Ll/ۚܰܿ;->۫ۧ:Ll/ܺ۟ܿ;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ll/ܺ۟ܿ;->֫(I)V

    .line 537
    invoke-direct {p0, v1}, Ll/ۚܰܿ;->ᩳ(Z)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 98
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0d0029

    .line 99
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const v0, 0x7f120433

    .line 100
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 101
    invoke-static {p0}, Ll/᩵֫ܳ;->֫(Ll/ۚܰܿ;)Ll/᩵֫ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    .line 102
    new-instance v0, Ll/᩶ܰܿ;

    invoke-direct {v0, p0}, Ll/᩶ܰܿ;-><init>(Ll/ۚܰܿ;)V

    iput-object v0, p0, Ll/ۚܰܿ;->᩹ۧ:Ll/᩶ܰܿ;

    const v0, 0x7f0a063a

    .line 103
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۢᩴ;

    iput-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 104
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 105
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v0

    .line 730
    new-instance v1, Ll/ܺܰܿ;

    invoke-direct {v1, p0}, Ll/ܺܰܿ;-><init>(Ll/ۚܰܿ;)V

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    const v0, 0x7f0a02af

    .line 107
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    const v0, 0x7f0a02b2

    .line 108
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    const v0, 0x7f0a04d3

    .line 109
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ܳܽ:Landroid/view/View;

    const v0, 0x7f0a0183

    .line 110
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۜܰܿ;

    iput-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const v0, 0x7f0a025d

    .line 111
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۚܰܿ;->۠ۧ:Landroid/widget/TextView;

    const v0, 0x7f0a02b0

    .line 112
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܺ۟ܿ;

    iput-object v0, p0, Ll/ۚܰܿ;->۬ۧ:Ll/ܺ۟ܿ;

    const v0, 0x7f0a02b1

    .line 113
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܺ۟ܿ;

    iput-object v0, p0, Ll/ۚܰܿ;->۫ۧ:Ll/ܺ۟ܿ;

    const v0, 0x7f0a0172

    .line 114
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۬ۧ֫;

    iput-object v0, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    .line 115
    invoke-virtual {v0, p0}, Ll/۬ۧ֫;->֫(Ll/۠ۧ֫;)V

    const v0, 0x7f0a00a3

    .line 116
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a4

    .line 117
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a5

    .line 118
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a6

    .line 119
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a7

    .line 120
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a8

    .line 121
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00a9

    .line 122
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00aa

    .line 123
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00ab

    .line 124
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00ac

    .line 125
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00ad

    .line 126
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00af

    .line 127
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00b0

    .line 128
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00b2

    .line 129
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00b4

    .line 130
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00b7

    .line 131
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ᩳ(I)V

    const v0, 0x7f0a00be

    .line 132
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    sget-object v1, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x7f0a00bf

    .line 133
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    sget-object v1, Ll/ۤ᩺ܿ;->᩺:Landroid/graphics/Typeface;

    .line 133
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 134
    iget-object v0, p0, Ll/ۚܰܿ;->۠ۧ:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v0, p0}, Ll/ۜܰܿ;->֫(Ll/ۚܰܿ;)V

    const v0, 0x7f0a017a

    .line 136
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    .line 137
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    .line 140
    iget-object v0, p0, Ll/ۚܰܿ;->ܳܽ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Ll/ۚܰܿ;->۬ۧ:Ll/ܺ۟ܿ;

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Ll/ܺ۟ܿ;->֫(I)V

    .line 142
    iget-object v0, p0, Ll/ۚܰܿ;->۫ۧ:Ll/ܺ۟ܿ;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Ll/ܺ۟ܿ;->֫(I)V

    .line 143
    invoke-direct {p0, v2}, Ll/ۚܰܿ;->ᩳ(Z)V

    .line 146
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "android.intent.action.VIEW"

    .line 147
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "android.intent.action.EDIT"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {p0}, Ll/ۚܰܿ;->finish()V

    return-void

    .line 148
    :cond_2
    :goto_0
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ll/ۗܺ᩷;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 153
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 151
    iput-object v2, p0, Ll/ۚܰܿ;->ۚۧ:Ll/ܶ᩵ܿ;

    const-string v2, "readOnly"

    .line 152
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚܰܿ;->ۧܽ:Z

    .line 153
    iget-object v0, p0, Ll/ۚܰܿ;->ۚۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    .line 154
    invoke-direct {p0}, Ll/ۚܰܿ;->᩻֫()V

    const/4 v0, 0x0

    if-nez p1, :cond_4

    move-object v2, v0

    goto :goto_1

    :cond_4
    const-string v2, "hex_session_token"

    .line 156
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    if-eqz p1, :cond_6

    const-string v2, "hex_ui_present"

    .line 449
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "hex_ui_scroll"

    .line 453
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v0, "hex_ui_selection_start"

    .line 454
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v0, "hex_ui_selection_end"

    .line 455
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v0, "hex_ui_select_hex_first"

    .line 456
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    const-string v0, "hex_ui_multi_select"

    .line 457
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 452
    invoke-static/range {v2 .. v7}, Ll/᩻ܰܿ;->֫(JIIZZ)Ll/᩻ܰܿ;

    move-result-object v0

    .line 458
    new-instance v2, Ll/ۗ᩺ܿ;

    const-string v3, "hex_ui_keyboard_showing"

    .line 459
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "hex_ui_keyboard_enable"

    .line 460
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "hex_ui_hex_mode"

    .line 461
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {v2, v3, v4, p1, v0}, Ll/ۗ᩺ܿ;-><init>(ZZZLl/᩻ܰܿ;)V

    move-object v0, v2

    .line 157
    :cond_6
    :goto_2
    iput-object v0, p0, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    .line 158
    new-instance p1, Ll/ۖ᩺ܿ;

    iget-object v0, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    .line 37
    invoke-direct {p1, p0, v0, v1, v1}, Ll/ۖ᩺ܿ;-><init>(Ll/ۚܰܿ;Ljava/lang/String;ZZ)V

    .line 158
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 677
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000e

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0489

    .line 678
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/ܰ۬;

    iput-object v0, p0, Ll/ۚܰܿ;->ܽܽ:Ll/ܰ۬;

    const v0, 0x7f0a065c

    .line 679
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/ܰ۬;

    iput-object v0, p0, Ll/ۚܰܿ;->ۡܽ:Ll/ܰ۬;

    const v0, 0x7f0a0375

    .line 680
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/ܰ۬;

    iput-object v0, p0, Ll/ۚܰܿ;->ܿܽ:Ll/ܰ۬;

    .line 682
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 1166
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳܽܳ;->ᩴ()Z

    move-result v0

    .line 683
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 1141
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ۧ()Z

    move-result v1

    .line 684
    iget-object v2, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 1145
    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->֫()Z

    move-result v2

    .line 685
    iget-object v3, p0, Ll/ۚܰܿ;->ܿܽ:Ll/ܰ۬;

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 686
    iget-object v0, p0, Ll/ۚܰܿ;->ۡܽ:Ll/ܰ۬;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 687
    iget-object v0, p0, Ll/ۚܰܿ;->ܽܽ:Ll/ܰ۬;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 689
    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, p0, Ll/ۚܰܿ;->ܿܽ:Ll/ܰ۬;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 691
    iget-object v0, p0, Ll/ۚܰܿ;->ۡܽ:Ll/ܰ۬;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 692
    iget-object v0, p0, Ll/ۚܰܿ;->ܽܽ:Ll/ܰ۬;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f0a0365

    .line 693
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 4

    const/4 v0, 0x1

    .line 798
    iput-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    .line 799
    iget-object v1, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    if-eqz v1, :cond_0

    .line 800
    invoke-virtual {v1}, Ll/᩵֫ܳ;->֫()V

    .line 802
    :cond_0
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-eqz v1, :cond_2

    .line 803
    invoke-virtual {v1}, Ll/ۜܰܿ;->ᩳ()V

    .line 804
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1}, Ll/ۜܰܿ;->ܽ()Z

    move-result v1

    .line 805
    iget-object v2, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 829
    new-instance v3, Ll/᩵ܰܿ;

    invoke-direct {v3, v2}, Ll/᩵ܰܿ;-><init>(Ll/ᩳܽܳ;)V

    if-nez v1, :cond_1

    .line 831
    invoke-virtual {v3}, Ll/᩵ܰܿ;->run()V

    goto :goto_0

    .line 835
    :cond_1
    :try_start_0
    iget-object v1, p0, Ll/ۚܰܿ;->ۘۧ:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 839
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v1, v3}, Ll/ۜܰܿ;->֫(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 840
    invoke-virtual {v3}, Ll/᩵ܰܿ;->run()V

    .line 811
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Ll/ۧܰܿ;->֫(Ljava/io/File;)V

    .line 812
    iget-object v1, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    if-eqz v1, :cond_6

    .line 813
    iget-boolean v2, p0, Ll/ۚܰܿ;->ۢۧ:Z

    iget-boolean v3, p0, Ll/ۚܰܿ;->֡ۧ:Z

    if-nez v3, :cond_4

    .line 814
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    if-nez v0, :cond_5

    .line 308
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 815
    iput-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 818
    :try_start_1
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 791
    :catch_1
    :cond_6
    :goto_2
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    return-void
.end method

.method public final onDrawerClosed(Landroid/view/View;)V
    .locals 2

    .line 1203
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0170

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 1204
    iput-boolean v1, p0, Ll/ۚܰܿ;->᩻ܽ:Z

    return-void

    .line 1206
    :cond_0
    iput-boolean v1, p0, Ll/ۚܰܿ;->᩶ۧ:Z

    return-void
.end method

.method public final onDrawerOpened(Landroid/view/View;)V
    .locals 2

    .line 1195
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0170

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 1196
    iput-boolean v1, p0, Ll/ۚܰܿ;->᩻ܽ:Z

    return-void

    .line 1198
    :cond_0
    iput-boolean v1, p0, Ll/ۚܰܿ;->᩶ۧ:Z

    return-void
.end method

.method public final onDrawerSlide(Landroid/view/View;F)V
    .locals 0

    return-void
.end method

.method public final onDrawerStateChanged(I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 1214
    iget-boolean v0, p0, Ll/ۚܰܿ;->᩻ܽ:Z

    if-eqz v0, :cond_1

    .line 1215
    iget-object p1, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    invoke-virtual {p1}, Ll/᩵֫ܳ;->ۧ()V

    .line 1216
    iget-object p1, p0, Ll/ۚܰܿ;->᩸ۧ:Landroid/view/inputmethod/InputMethodManager;

    if-nez p1, :cond_0

    .line 1217
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Ll/ۚܰܿ;->᩸ۧ:Landroid/view/inputmethod/InputMethodManager;

    if-nez p1, :cond_0

    goto :goto_0

    .line 1220
    :cond_0
    iget-object p1, p0, Ll/ۚܰܿ;->᩸ۧ:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void

    :cond_1
    if-eqz p1, :cond_3

    .line 1224
    iget-boolean p1, p0, Ll/ۚܰܿ;->᩶ۧ:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/ۚܰܿ;->ܺܽ:Z

    if-eqz p1, :cond_2

    .line 1225
    iget-object p1, p0, Ll/ۚܰܿ;->᩹ۧ:Ll/᩶ܰܿ;

    invoke-virtual {p1}, Ll/᩶ܰܿ;->֫()V

    .line 1226
    iput-boolean v1, p0, Ll/ۚܰܿ;->ܺܽ:Z

    :cond_2
    :goto_0
    return-void

    :cond_3
    const/4 p1, 0x1

    .line 1229
    iput-boolean p1, p0, Ll/ۚܰܿ;->ܺܽ:Z

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    .line 701
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a065c

    if-ne p1, v0, :cond_0

    .line 703
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p1}, Ll/ۜܰܿ;->ۡ()V

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0a0489

    if-ne p1, v0, :cond_1

    .line 705
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p1}, Ll/ۜܰܿ;->᩷()V

    goto/16 :goto_0

    :cond_1
    const v0, 0x7f0a0375

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 707
    invoke-direct {p0, v1}, Ll/ۚܰܿ;->ܽ(Z)V

    goto/16 :goto_0

    :cond_2
    const v0, 0x7f0a033c

    if-ne p1, v0, :cond_3

    .line 709
    invoke-direct {p0}, Ll/ۚܰܿ;->ܿ֫()V

    goto/16 :goto_0

    :cond_3
    const v0, 0x7f0a037c

    const v2, 0x800003

    const v3, 0x800005

    if-ne p1, v0, :cond_5

    .line 711
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v3}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 712
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v3}, Ll/۬ۧ֫;->֫(I)V

    .line 713
    :cond_4
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v2}, Ll/۬ۧ֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_5
    const v0, 0x7f0a0356

    if-ne p1, v0, :cond_7

    .line 715
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v2}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 716
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v2}, Ll/۬ۧ֫;->֫(I)V

    .line 717
    :cond_6
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    invoke-virtual {p1, v3}, Ll/۬ۧ֫;->ܿ(I)V

    goto :goto_0

    :cond_7
    const v0, 0x7f0a0347

    if-ne p1, v0, :cond_8

    .line 719
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-static {p1}, Ll/֨᩺ܿ;->֫(Ll/ۜܰܿ;)V

    goto :goto_0

    :cond_8
    const v0, 0x7f0a0365

    if-ne p1, v0, :cond_c

    .line 721
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "clipboard"

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    .line 31
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v3

    const v4, 0x7f120a7f

    if-nez v3, :cond_9

    .line 32
    invoke-static {v4, v1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_0

    .line 36
    :cond_9
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 37
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 38
    invoke-static {v4, v1}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_0

    .line 41
    :cond_a
    invoke-static {p1}, Ll/۬۟ܿ;->ۧ(Ll/ۜܰܿ;)Ll/۬۟ܿ;

    move-result-object v1

    if-nez v1, :cond_b

    goto :goto_0

    .line 45
    :cond_b
    sget v3, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v3, Ll/᩵ۚۢ;

    invoke-direct {v3, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Ll/᩵۟ܿ;

    invoke-direct {v0, p1, v1, v2}, Ll/᩵۟ܿ;-><init>(Ll/ۜܰܿ;Ll/۬۟ܿ;Ljava/lang/CharSequence;)V

    const p1, 0x7f030020

    .line 46
    invoke-virtual {v3, p1, v0}, Ll/᩵ۚۢ;->֫(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 48
    invoke-virtual {v3}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܳ()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 50
    invoke-virtual {p1}, Ll/֡ۚۢ;->᩷()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_c
    return v1
.end method

.method public final onResume()V
    .locals 3

    .line 414
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 454
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۢۧ:Z

    .line 455
    iget-boolean v1, p0, Ll/ۚܰܿ;->ۡۧ:Z

    const/4 v2, 0x0

    .line 456
    iput-boolean v2, p0, Ll/ۚܰܿ;->ۢۧ:Z

    .line 457
    iput-boolean v2, p0, Ll/ۚܰܿ;->ۡۧ:Z

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 458
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 480
    :cond_0
    invoke-virtual {v0}, Ll/᩺ܰܿ;->ܳ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    .line 484
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    .line 484
    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩸()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 488
    :catch_0
    iget-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    invoke-virtual {v0}, Ll/᩺ܰܿ;->᩻()Z

    move-result v2

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    .line 465
    :cond_2
    iget-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    invoke-virtual {v0}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object v0

    .line 466
    iput-object v0, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    .line 467
    iput-boolean v1, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    .line 473
    new-instance v2, Ll/ۖ᩺ܿ;

    invoke-direct {v2, p0, v0, v1, v1}, Ll/ۖ᩺ܿ;-><init>(Ll/ۚܰܿ;Ljava/lang/String;ZZ)V

    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    .line 416
    :cond_3
    :goto_1
    iget-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-nez v0, :cond_4

    goto :goto_2

    .line 290
    :cond_4
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    .line 420
    iget-object v1, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    invoke-virtual {v1, v0}, Ll/ᩴܰܿ;->֫(Ll/ᩳܽܳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 426
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩸()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 431
    iget-object v1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    invoke-virtual {p0, v0, v1}, Ll/ۚܰܿ;->֫(Ll/ᩳܽܳ;Ll/۠ܰܿ;)V

    return-void

    :catch_1
    move-exception v0

    .line 428
    invoke-virtual {p0, v0}, Ll/ۚܰܿ;->֫(Ljava/io/IOException;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 563
    iget-boolean v3, v1, Ll/ۚܰܿ;->ۡۧ:Z

    const/4 v4, 0x0

    .line 564
    iput-boolean v4, v1, Ll/ۚܰܿ;->ۢۧ:Z

    .line 565
    iput-boolean v4, v1, Ll/ۚܰܿ;->ۡۧ:Z

    .line 566
    iget-object v0, v1, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    if-eqz v0, :cond_0

    .line 567
    invoke-virtual {v0}, Ll/᩵֫ܳ;->֫()V

    .line 569
    :cond_0
    iget-object v0, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-eqz v0, :cond_1

    .line 570
    invoke-virtual {v0}, Ll/ۜܰܿ;->ᩳ()V

    .line 571
    iget-object v0, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v0}, Ll/ۜܰܿ;->ܽ()Z

    .line 573
    :cond_1
    iget-object v0, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    const/4 v5, 0x0

    if-nez v0, :cond_2

    move-object v9, v5

    goto :goto_0

    .line 290
    :cond_2
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    move-object v9, v0

    .line 574
    :goto_0
    iget-object v7, v1, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    if-eqz v7, :cond_4

    if-eqz v9, :cond_4

    .line 580
    :try_start_0
    invoke-virtual {v9}, Ll/ᩳܽܳ;->ۜ()Ll/᩷ۧܳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v5

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v6, v0

    move-object v0, v5

    .line 584
    :goto_1
    new-instance v8, Ll/ۗ᩺ܿ;

    iget-boolean v10, v1, Ll/ۚܰܿ;->ۛۧ:Z

    iget-boolean v11, v1, Ll/ۚܰܿ;->ۗۧ:Z

    iget-boolean v12, v1, Ll/ۚܰܿ;->ܶۧ:Z

    iget-object v13, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-nez v0, :cond_3

    move-object v14, v5

    goto :goto_2

    .line 586
    :cond_3
    invoke-virtual {v0}, Ll/᩷ۧܳ;->ᩳ()Ll/ۙۧܳ;

    move-result-object v14

    :goto_2
    invoke-virtual {v13, v14}, Ll/ۜܰܿ;->֫(Ll/ۙۧܳ;)Ll/᩻ܰܿ;

    move-result-object v13

    invoke-direct {v8, v10, v11, v12, v13}, Ll/ۗ᩺ܿ;-><init>(ZZZLl/᩻ܰܿ;)V

    iput-object v8, v1, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    goto :goto_3

    :cond_4
    move-object v0, v5

    move-object v6, v0

    .line 588
    :goto_3
    iget-object v8, v1, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    const/4 v14, 0x1

    if-eqz v8, :cond_5

    const-string v10, "hex_ui_present"

    .line 436
    invoke-virtual {v2, v10, v14}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_keyboard_showing"

    .line 437
    iget-boolean v11, v8, Ll/ۗ᩺ܿ;->ܽ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_keyboard_enable"

    .line 438
    iget-boolean v11, v8, Ll/ۗ᩺ܿ;->ۧ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_hex_mode"

    .line 439
    iget-boolean v11, v8, Ll/ۗ᩺ܿ;->֫:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 440
    iget-object v8, v8, Ll/ۗ᩺ܿ;->ᩳ:Ll/᩻ܰܿ;

    iget-wide v10, v8, Ll/᩻ܰܿ;->ۧ:J

    const-string v12, "hex_ui_scroll"

    invoke-virtual {v2, v12, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v10, "hex_ui_selection_start"

    .line 441
    iget v11, v8, Ll/᩻ܰܿ;->ܿ:I

    invoke-virtual {v2, v10, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v10, "hex_ui_selection_end"

    .line 442
    iget v11, v8, Ll/᩻ܰܿ;->ᩳ:I

    invoke-virtual {v2, v10, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v10, "hex_ui_select_hex_first"

    .line 443
    iget-boolean v11, v8, Ll/᩻ܰܿ;->ܽ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_multi_select"

    .line 444
    iget-boolean v8, v8, Ll/᩻ܰܿ;->֫:Z

    invoke-virtual {v2, v10, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 591
    :cond_5
    iget-object v8, v1, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    const-string v15, "hex_session_token"

    if-eqz v8, :cond_7

    iget-object v10, v1, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    if-eqz v10, :cond_6

    iget-boolean v10, v1, Ll/ۚܰܿ;->ᩳܽ:Z

    if-eqz v10, :cond_7

    .line 592
    :cond_6
    invoke-virtual {v2, v15, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    iput-boolean v14, v1, Ll/ۚܰܿ;->ۢۧ:Z

    goto/16 :goto_8

    .line 596
    :cond_7
    iget-object v8, v1, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 598
    iget-boolean v10, v1, Ll/ۚܰܿ;->ᩳܽ:Z

    const-wide/high16 v12, -0x8000000000000000L

    if-nez v10, :cond_d

    if-eqz v9, :cond_d

    if-eqz v7, :cond_d

    if-eqz v0, :cond_d

    .line 600
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Ll/ۚܰܿ;->۟()Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v0}, Ll/᩷ۧܳ;->֫()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, 0x1

    const/4 v11, 0x1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_6

    :cond_8
    const/4 v6, 0x0

    const/4 v11, 0x0

    .line 601
    :goto_4
    invoke-virtual {v0}, Ll/᩷ۧܳ;->ܽ()J

    move-result-wide v16

    if-nez v11, :cond_9

    .line 602
    iget-boolean v0, v1, Ll/ۚܰܿ;->ۖۧ:Z

    if-eqz v0, :cond_9

    .line 364
    iput-wide v12, v1, Ll/ۚܰܿ;->ۜۧ:J

    .line 365
    iput-boolean v4, v1, Ll/ۚܰܿ;->᩷ۧ:Z

    if-eqz v8, :cond_e

    .line 606
    iput-object v5, v1, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 607
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ۧ()V

    goto/16 :goto_8

    :cond_9
    if-eqz v8, :cond_a

    .line 611
    iget-wide v4, v1, Ll/ۚܰܿ;->ۜۧ:J

    cmp-long v0, v4, v16

    if-nez v0, :cond_a

    iget-boolean v0, v1, Ll/ۚܰܿ;->᩷ۧ:Z

    if-ne v0, v11, :cond_a

    .line 614
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 615
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v15, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    iput-boolean v14, v1, Ll/ۚܰܿ;->ۢۧ:Z

    .line 618
    iput-boolean v3, v1, Ll/ۚܰܿ;->ۡۧ:Z

    goto/16 :goto_8

    :cond_a
    if-nez v8, :cond_b

    .line 623
    invoke-static {}, Ll/᩺ܰܿ;->ܺ()Ll/᩺ܰܿ;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x1

    move-object v4, v8

    const/4 v3, 0x1

    goto :goto_5

    :cond_b
    const/4 v0, 0x0

    move-object v4, v8

    const/4 v3, 0x0

    .line 627
    :goto_5
    :try_start_2
    iget-object v0, v1, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    invoke-virtual {v0, v9}, Ll/ᩴܰܿ;->֫(Ll/ᩳܽܳ;)Z

    move-result v0

    xor-int/2addr v0, v14

    .line 628
    iget-boolean v8, v1, Ll/ۚܰܿ;->ۖۧ:Z

    iget-boolean v5, v1, Ll/ۚܰܿ;->ܰۧ:Z

    iget-object v10, v1, Ll/ۚܰܿ;->᩻ۧ:Ljava/util/concurrent/Executor;

    move-object v6, v4

    move-object/from16 v16, v10

    move v10, v11

    move/from16 v18, v11

    move v11, v5

    move v12, v0

    move-object/from16 v13, v16

    invoke-static/range {v6 .. v13}, Ll/۫᩺ܿ;->֫(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZLl/ᩳܽܳ;ZZZLjava/util/concurrent/Executor;)Ll/ۛܰܿ;

    move-result-object v0

    .line 632
    invoke-virtual {v4}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v15, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    iput-boolean v14, v1, Ll/ۚܰܿ;->ۢۧ:Z

    .line 634
    iput-boolean v14, v1, Ll/ۚܰܿ;->ۡۧ:Z

    .line 635
    invoke-virtual {v0}, Ll/ۛܰܿ;->ۧ()J

    move-result-wide v5

    iput-wide v5, v1, Ll/ۚܰܿ;->ۜۧ:J

    move/from16 v6, v18

    .line 636
    iput-boolean v6, v1, Ll/ۚܰܿ;->᩷ۧ:Z

    if-eqz v3, :cond_e

    .line 638
    iput-object v4, v1, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v8, v4

    const-wide/high16 v4, -0x8000000000000000L

    move/from16 v19, v3

    move-object v3, v0

    move/from16 v0, v19

    goto :goto_7

    :goto_6
    const/4 v3, 0x0

    move-object v3, v0

    const/4 v0, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    .line 364
    :goto_7
    iput-wide v4, v1, Ll/ۚܰܿ;->ۜۧ:J

    const/4 v4, 0x0

    .line 365
    iput-boolean v4, v1, Ll/ۚܰܿ;->᩷ۧ:Z

    if-eqz v0, :cond_c

    .line 646
    :try_start_3
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 648
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_c
    if-eqz v8, :cond_e

    .line 653
    :try_start_4
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ܽ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v4, v0

    .line 655
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_d
    move-wide v4, v12

    if-eqz v6, :cond_e

    .line 364
    iput-wide v4, v1, Ll/ۚܰܿ;->ۜۧ:J

    const/4 v0, 0x0

    .line 365
    iput-boolean v0, v1, Ll/ۚܰܿ;->᩷ۧ:Z

    if-eqz v8, :cond_e

    .line 664
    :try_start_5
    invoke-virtual {v8}, Ll/᩺ܰܿ;->ܽ()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v3, v0

    .line 666
    invoke-virtual {v6, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 558
    :cond_e
    :goto_8
    invoke-super/range {p0 .. p1}, Ll/᩻ܽ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(IIIZ)V
    .locals 7

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p4, :cond_2

    .line 1015
    iget-boolean p4, p0, Ll/ۚܰܿ;->ۗۧ:Z

    if-eqz p4, :cond_0

    .line 1016
    invoke-virtual {p0}, Ll/ۚܰܿ;->ܰ()V

    .line 1017
    :cond_0
    iget-boolean p4, p0, Ll/ۚܰܿ;->ܶۧ:Z

    if-eqz p4, :cond_1

    const-string p4, "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]"

    goto :goto_0

    :cond_1
    const-string p4, "Sel: %d - %d  Len: %d  Size: %d [DEC]"

    :goto_0
    sub-int v4, p2, p1

    add-int/2addr v4, v3

    .line 1021
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, v2

    aput-object p2, v6, v3

    aput-object v4, v6, v1

    aput-object p3, v6, v0

    invoke-static {v5, p4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1022
    iget-object p2, p0, Ll/ۚܰܿ;->۠ۧ:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    if-ge p1, p3, :cond_4

    .line 1025
    iget-boolean p2, p0, Ll/ۚܰܿ;->ܶۧ:Z

    if-eqz p2, :cond_3

    const-string p2, "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]"

    goto :goto_1

    :cond_3
    const-string p2, "Val: %d  Pos: %d  Size: %d [DEC]"

    .line 1030
    :goto_1
    :try_start_0
    iget-object p4, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object p4, p4, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p4}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object p4

    new-array v4, v3, [B

    .line 25
    invoke-virtual {p4, p1, v3, v4}, Ll/ᩳܽܳ;->ܿ(II[B)V

    .line 26
    aget-byte p4, v4, v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 p4, p4, 0xff

    .line 1038
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p4, v0, v2

    aput-object p1, v0, v3

    aput-object p3, v0, v1

    invoke-static {v4, p2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1039
    iget-object p2, p0, Ll/ۚܰܿ;->۠ۧ:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :catch_0
    move-exception p1

    .line 1032
    invoke-virtual {p0, p1}, Ll/ۚܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 1041
    :cond_4
    iget-boolean p1, p0, Ll/ۚܰܿ;->ܶۧ:Z

    if-eqz p1, :cond_5

    const-string p1, "Size: %Xh [HEX]"

    goto :goto_2

    :cond_5
    const-string p1, "Size: %d [DEC]"

    .line 1044
    :goto_2
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array p4, v3, [Ljava/lang/Object;

    aput-object p3, p4, v2

    invoke-static {p2, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1045
    iget-object p2, p0, Ll/ۚܰܿ;->۠ۧ:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 2

    .line 1060
    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    .line 1061
    instance-of v1, p1, Ll/ۚᩳܳ;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 1062
    invoke-direct {p0, p1}, Ll/ۚܰܿ;->ۧ(Z)V

    return-void
.end method

.method public final ֫(Ll/۠ܰܿ;)V
    .locals 3

    .line 332
    iput-object p1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    .line 339
    iget-object p1, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    const-wide/high16 v0, -0x8000000000000000L

    .line 364
    iput-wide v0, p0, Ll/ۚܰܿ;->ۜۧ:J

    const/4 v0, 0x0

    .line 365
    iput-boolean v0, p0, Ll/ۚܰܿ;->᩷ۧ:Z

    if-nez p1, :cond_0

    .line 342
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۢۧ:Z

    .line 343
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۡۧ:Z

    goto :goto_0

    .line 347
    :cond_0
    :try_start_0
    iget-boolean v1, p0, Ll/ۚܰܿ;->ۖۧ:Z

    if-eqz v1, :cond_1

    .line 348
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۢۧ:Z

    .line 349
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۡۧ:Z

    const/4 v0, 0x0

    .line 350
    iput-object v0, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 351
    invoke-virtual {p1}, Ll/᩺ܰܿ;->ۧ()V

    goto :goto_0

    .line 354
    :cond_1
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object p1, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object p1

    .line 354
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۚܰܿ;->ۜۧ:J

    .line 355
    iput-boolean v0, p0, Ll/ۚܰܿ;->᩷ۧ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    :catch_0
    :goto_0
    iget-object p1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p1}, Ll/ۜܰܿ;->ۜ()V

    return-void
.end method

.method public final ֫(Ll/ܺܺܽ;)V
    .locals 2

    .line 1278
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1279
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 1280
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v1

    .line 1280
    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    .line 1281
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void

    .line 1283
    :cond_0
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 1284
    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 934
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ᩳ()I

    move-result v1

    .line 1284
    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(I)V

    .line 1285
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method

.method public final ֫(Ll/ᩳܽܳ;Ll/۠ܰܿ;)V
    .locals 1

    .line 438
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۚܰܿ;->ܿۧ:Ll/֡ܰܿ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    .line 439
    invoke-virtual {v0, p1}, Ll/ᩴܰܿ;->֫(Ll/ᩳܽܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 442
    :cond_0
    new-instance v0, Ll/֡ܰܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/֡ܰܿ;-><init>(Ll/ۚܰܿ;Ll/ᩳܽܳ;Ll/۠ܰܿ;)V

    .line 443
    iput-object v0, p0, Ll/ۚܰܿ;->ܿۧ:Ll/֡ܰܿ;

    .line 445
    :try_start_0
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 447
    iput-object p1, p0, Ll/ۚܰܿ;->ܿۧ:Ll/֡ܰܿ;

    const p1, 0x7f1207da

    .line 448
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ۧ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ᩳܽܳ;Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZ)V
    .locals 10

    .line 173
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_f

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 188
    :cond_0
    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v0

    .line 190
    iput-boolean p5, p0, Ll/ۚܰܿ;->ܰۧ:Z

    .line 191
    iget-object p5, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v1

    invoke-virtual {p5, v1}, Ll/ۜܰܿ;->֫(Z)V

    .line 192
    iget-object p5, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {p5, p1}, Ll/ۜܰܿ;->֫(Ll/ᩳܽܳ;)Ll/ᩳܽܳ;

    move-result-object p5

    .line 193
    iget-object v1, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 194
    iput-object p2, p0, Ll/ۚܰܿ;->᩷ܽ:Ll/᩺ܰܿ;

    .line 195
    iput-object p3, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    .line 196
    iput-boolean p4, p0, Ll/ۚܰܿ;->ۖۧ:Z

    const/4 p4, 0x0

    .line 197
    iput-boolean p4, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    .line 199
    iget-object v2, p0, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    const/4 v3, 0x0

    .line 200
    iput-object v3, p0, Ll/ۚܰܿ;->֫ܽ:Ll/ۗ᩺ܿ;

    .line 257
    iput-object v3, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    const/4 v4, 0x4

    const/16 v5, 0x8

    const v6, 0x3e99999a    # 0.3f

    if-eqz v2, :cond_2

    .line 204
    iget-boolean v7, v2, Ll/ۗ᩺ܿ;->ܽ:Z

    iput-boolean v7, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 205
    iget-boolean v7, v2, Ll/ۗ᩺ܿ;->ۧ:Z

    iput-boolean v7, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 206
    iget-boolean v7, v2, Ll/ۗ᩺ܿ;->֫:Z

    iput-boolean v7, p0, Ll/ۚܰܿ;->ܶۧ:Z

    .line 208
    :try_start_0
    iget-object v7, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    iget-object v2, v2, Ll/ۗ᩺ܿ;->ᩳ:Ll/᩻ܰܿ;

    invoke-virtual {v7, v2}, Ll/ۜܰܿ;->֫(Ll/᩻ܰܿ;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 213
    :catch_0
    iget-object v2, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 922
    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->᩷()I

    move-result v2

    .line 213
    iget-object v7, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 926
    iget-object v7, v7, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v7}, Ll/ۧܰܿ;->ۜ()I

    move-result v7

    .line 213
    iget-object v8, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 930
    iget-object v8, v8, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v8}, Ll/ۧܰܿ;->ۡ()Z

    move-result v8

    .line 214
    iget-object v9, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 934
    iget-object v9, v9, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v9}, Ll/ۧܰܿ;->ᩳ()I

    move-result v9

    .line 213
    invoke-virtual {p0, v2, v7, v9, v8}, Ll/ۚܰܿ;->֫(IIIZ)V

    .line 264
    :goto_0
    iget-object v2, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    iget-boolean v7, p0, Ll/ۚܰܿ;->ۗۧ:Z

    if-eqz v7, :cond_1

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    const v7, 0x3e99999a    # 0.3f

    :goto_1
    invoke-virtual {v2, v7}, Landroid/view/View;->setAlpha(F)V

    .line 265
    iget-boolean v2, p0, Ll/ۚܰܿ;->ۛۧ:Z

    if-nez v2, :cond_2

    .line 266
    iget-object v2, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 267
    iget-object v2, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    if-eqz p2, :cond_3

    .line 218
    invoke-virtual {p2}, Ll/᩺ܰܿ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 219
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v7

    iput-wide v7, p0, Ll/ۚܰܿ;->ۜۧ:J

    .line 220
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ᩴ()Z

    move-result v2

    iput-boolean v2, p0, Ll/ۚܰܿ;->᩷ۧ:Z

    goto :goto_2

    :cond_3
    const-wide/high16 v7, -0x8000000000000000L

    .line 364
    iput-wide v7, p0, Ll/ۚܰܿ;->ۜۧ:J

    .line 365
    iput-boolean p4, p0, Ll/ۚܰܿ;->᩷ۧ:Z

    :goto_2
    if-eqz v0, :cond_4

    .line 224
    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    .line 225
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 226
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 381
    :cond_4
    invoke-virtual {p0}, Ll/ۚܰܿ;->۟()Z

    move-result v0

    .line 382
    iget-object v2, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    invoke-virtual {v2, v0}, Ll/ۜܰܿ;->֫(Z)V

    .line 383
    iget-object v2, p0, Ll/ۚܰܿ;->ۜܽ:Ll/᩵֫ܳ;

    invoke-virtual {v2, v0}, Ll/᩵֫ܳ;->֫(Z)V

    const v2, 0x7f0a025e

    .line 384
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iget-boolean v7, p0, Ll/ۚܰܿ;->ܰۧ:Z

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_3

    :cond_5
    const/16 v7, 0x8

    :goto_3
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 385
    invoke-direct {p0}, Ll/ۚܰܿ;->᩻֫()V

    .line 387
    iget-object v2, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    if-eqz v2, :cond_6

    .line 388
    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    .line 389
    iput-object v3, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    .line 391
    :cond_6
    iget-object v2, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 392
    iget-object v2, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    xor-int/lit8 v7, v0, 0x1

    invoke-virtual {v2, v7}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v0, :cond_7

    .line 394
    iput-boolean p4, p0, Ll/ۚܰܿ;->ۗۧ:Z

    .line 395
    iget-object v2, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    invoke-virtual {v2, v6}, Landroid/view/View;->setAlpha(F)V

    .line 396
    iput-boolean p4, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 397
    iget-object p4, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    invoke-virtual {p4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 398
    iget-object p4, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    invoke-virtual {p4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 399
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    goto :goto_4

    .line 401
    :cond_7
    iget-object v2, p0, Ll/ۚܰܿ;->ۨۧ:Landroid/view/View;

    iget-boolean v7, p0, Ll/ۚܰܿ;->ۗۧ:Z

    if-eqz v7, :cond_8

    const/high16 v6, 0x3f800000    # 1.0f

    :cond_8
    invoke-virtual {v2, v6}, Landroid/view/View;->setAlpha(F)V

    .line 402
    iget-object v2, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    iget-boolean v6, p0, Ll/ۚܰܿ;->ۛۧ:Z

    if-eqz v6, :cond_9

    const/4 v5, 0x0

    :cond_9
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 403
    iget-object v2, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    iget-boolean v5, p0, Ll/ۚܰܿ;->ۛۧ:Z

    if-eqz v5, :cond_a

    const/4 v4, 0x0

    :cond_a
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 404
    invoke-virtual {p0}, Ll/֨ܿ;->ۖ()Ll/ۤᩳ;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 405
    invoke-virtual {p0}, Ll/֨ܿ;->ۖ()Ll/ۤᩳ;

    move-result-object v2

    invoke-virtual {v2, p4}, Ll/ۤᩳ;->ܽ(Z)V

    .line 407
    :cond_b
    iget-object p4, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p4, v3}, Ll/ۢᩴ;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 409
    :goto_4
    iget-object p4, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    if-eqz v0, :cond_c

    new-instance v3, Ll/ۡܰܿ;

    const/4 v0, 0x0

    invoke-direct {v3, v0, p0}, Ll/ۡܰܿ;-><init>(ILjava/lang/Object;)V

    :cond_c
    invoke-virtual {p4, v3}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    iget-object p4, p0, Ll/ۚܰܿ;->᩹ۧ:Ll/᩶ܰܿ;

    invoke-virtual {p4}, Ll/᩶ܰܿ;->֫()V

    .line 231
    invoke-virtual {p0}, Ll/֨ܿ;->invalidateOptionsMenu()V

    .line 234
    invoke-virtual {p0, p1, p3}, Ll/ۚܰܿ;->֫(Ll/ᩳܽܳ;Ll/۠ܰܿ;)V

    if-eqz p5, :cond_d

    if-eq p5, p1, :cond_d

    .line 238
    :try_start_1
    invoke-virtual {p5}, Ll/ᩳܽܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    nop

    :cond_d
    :goto_5
    if-eqz v1, :cond_10

    if-eq v1, p2, :cond_10

    if-eqz p2, :cond_e

    .line 244
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/᩺ܰܿ;->ܿ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 246
    :cond_e
    :try_start_2
    invoke-virtual {v1}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_8

    .line 175
    :cond_f
    :goto_6
    :try_start_3
    invoke-virtual {p1}, Ll/ᩳܽܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_7

    :catch_2
    nop

    :goto_7
    if-eqz p2, :cond_10

    .line 179
    invoke-virtual {p0, p2}, Ll/ۚܰܿ;->֫(Ll/᩺ܰܿ;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 181
    :try_start_4
    invoke-virtual {p2}, Ll/᩺ܰܿ;->ۧ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_10
    :goto_8
    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    const/4 v0, 0x5

    const/4 v1, 0x3

    if-eqz p1, :cond_0

    .line 1180
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    const/4 v2, 0x1

    .line 584
    :goto_0
    invoke-virtual {p1, v2, v1}, Ll/۬ۧ֫;->֫(II)V

    .line 585
    invoke-virtual {p1, v2, v0}, Ll/۬ۧ֫;->֫(II)V

    return-void

    .line 1182
    :cond_0
    iget-object p1, p0, Ll/ۚܰܿ;->ᩴۧ:Ll/۬ۧ֫;

    const/4 v2, 0x0

    goto :goto_0
.end method

.method public final ֫(ZZZ)V
    .locals 4

    .line 1162
    iget-boolean v0, p0, Ll/ۚܰܿ;->᩺ۧ:Z

    if-eq v0, p3, :cond_1

    .line 1163
    iput-boolean p3, p0, Ll/ۚܰܿ;->᩺ۧ:Z

    .line 1164
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    if-eqz p3, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    const-string v3, " *"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1164
    :cond_0
    iget-object v1, p0, Ll/ۚܰܿ;->֨ۧ:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1166
    :cond_1
    iget-object v0, p0, Ll/ۚܰܿ;->ܿܽ:Ll/ܰ۬;

    if-eqz v0, :cond_2

    .line 1167
    invoke-interface {v0, p3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1169
    :cond_2
    iget-object p3, p0, Ll/ۚܰܿ;->ۡܽ:Ll/ܰ۬;

    if-eqz p3, :cond_3

    .line 1170
    invoke-interface {p3, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1172
    :cond_3
    iget-object p1, p0, Ll/ۚܰܿ;->ܽܽ:Ll/ܰ۬;

    if-eqz p1, :cond_4

    .line 1173
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_4
    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/ᩳܽܳ;)Z
    .locals 1

    .line 318
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 319
    iget-object v0, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    .line 320
    invoke-virtual {v0, p1, p2}, Ll/ᩴܰܿ;->֫(Ljava/lang/Object;Ll/ᩳܽܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩺ܰܿ;)Z
    .locals 4

    .line 291
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۢۧ:Z

    iget-boolean v1, p0, Ll/ۚܰܿ;->֡ۧ:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 292
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    if-eqz p1, :cond_2

    .line 308
    invoke-virtual {p1}, Ll/᩺ܰܿ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v3
.end method

.method public final ֫֫()V
    .locals 2

    const/4 v0, 0x0

    .line 494
    iput-object v0, p0, Ll/ۚܰܿ;->۟ۧ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 495
    iput-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    .line 496
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 501
    iget-object v1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    invoke-virtual {p0, v0, v1}, Ll/ۚܰܿ;->֫(Ll/ᩳܽܳ;Ll/۠ܰܿ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "HexEditor"

    return-object v0
.end method

.method public final ۟()Z
    .locals 1

    .line 165
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۧܽ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۚܰܿ;->ܰۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;Ll/ᩳܽܳ;)V
    .locals 1

    .line 325
    iget-object v0, p0, Ll/ۚܰܿ;->ᩳۧ:Ll/ᩴܰܿ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴܰܿ;->ۧ(Ljava/lang/Object;Ll/ᩳܽܳ;)V

    return-void
.end method

.method public final ۧ(Ll/۠ܰܿ;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 373
    iput-object p1, p0, Ll/ۚܰܿ;->ۢܽ:Ll/۠ܰܿ;

    :cond_0
    const/4 p1, 0x0

    .line 376
    invoke-direct {p0, p1}, Ll/ۚܰܿ;->ۧ(Z)V

    return-void
.end method

.method public final ۧ֫()V
    .locals 1

    .line 1053
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۗۧ:Z

    if-eqz v0, :cond_0

    .line 1054
    invoke-direct {p0}, Ll/ۚܰܿ;->ܳ֫()V

    :cond_0
    return-void
.end method

.method public final ۨ()Z
    .locals 2

    .line 507
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۚܰܿ;->ᩳܽ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    .line 512
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܽܳ;->᩸()V

    .line 513
    iget-boolean v1, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܰ()V
    .locals 5

    .line 938
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 939
    iput-boolean v0, p0, Ll/ۚܰܿ;->ۛۧ:Z

    .line 941
    iget-object v1, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    if-eqz v1, :cond_0

    .line 942
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    const/4 v1, 0x0

    .line 943
    iput-object v1, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    .line 946
    :cond_0
    iget-object v1, p0, Ll/ۚܰܿ;->ۤۧ:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 947
    iget-object v1, p0, Ll/ۚܰܿ;->ۙۧ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v4, v3, v0

    const/4 v0, 0x1

    aput v2, v3, v0

    const-string v0, "translationY"

    invoke-static {v1, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0xc8

    .line 948
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 949
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 950
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    new-instance v1, Ll/ۘܰܿ;

    invoke-direct {v1, p0}, Ll/ۘܰܿ;-><init>(Ll/ۚܰܿ;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 957
    iget-object v0, p0, Ll/ۚܰܿ;->ܳۧ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    return-void
.end method

.method public final ܽ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 1072
    invoke-direct {p0, v0}, Ll/ۚܰܿ;->ۧ(Z)V

    return-void
.end method

.method public final ᩳ֫()Z
    .locals 1

    .line 302
    iget-boolean v0, p0, Ll/ۚܰܿ;->ܺۧ:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ()V
    .locals 0

    .line 749
    invoke-direct {p0}, Ll/ۚܰܿ;->ܿ֫()V

    return-void
.end method

.method public final ᩺()Z
    .locals 1

    .line 297
    iget-boolean v0, p0, Ll/ۚܰܿ;->ۢۧ:Z

    return v0
.end method
