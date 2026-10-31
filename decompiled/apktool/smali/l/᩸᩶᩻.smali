.class public final Ll/᩸᩶᩻;
.super Ljava/lang/Object;
.source "81ZE"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public ۧ:Ll/ܶ᩵ܿ;

.field public ܽ:Ll/ۡܰۡ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 362
    iput-object p1, p0, Ll/᩸᩶᩻;->֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸᩶᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩶᩻;->֫:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩸᩶᩻;Ll/ۡܰۡ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸᩶᩻;->ܽ:Ll/ۡܰۡ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸᩶᩻;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸᩶᩻;->ۧ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩸᩶᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩶᩻;->ۧ:Ll/ܶ᩵ܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/᩸᩶᩻;->ۧ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final varargs ֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V
    .locals 3

    .line 388
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p3, v1

    .line 389
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 366
    :cond_0
    iget-object p3, p0, Ll/᩸᩶᩻;->ۧ:Ll/ܶ᩵ܿ;

    .line 378
    sget-boolean v0, Ll/᩶ۖ᩷;->֫:Z

    const/4 v1, 0x1

    invoke-virtual {p3, p1, v0, v1, p2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ()Ll/ۡܰۡ;
    .locals 1

    .line 370
    iget-object v0, p0, Ll/᩸᩶᩻;->ܽ:Ll/ۡܰۡ;

    return-object v0
.end method
