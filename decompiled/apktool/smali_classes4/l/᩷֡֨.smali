.class public Ll/᩷֡֨;
.super Ljava/lang/RuntimeException;
.source "643O"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۙ:Ll/ۛ֡֨;

.field public transient ᩶:Ljava/util/function/Supplier;

.field public final transient ᩸:Ll/֫ᩴ֨;

.field public transient ᩹:Ll/ܽܶ۠;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ljava/util/function/Supplier;Ll/֫ᩴ֨;)V
    .locals 0

    .line 2555
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2556
    iput-object p3, p0, Ll/᩷֡֨;->᩸:Ll/֫ᩴ֨;

    .line 2557
    iput-object p1, p0, Ll/᩷֡֨;->ۙ:Ll/ۛ֡֨;

    .line 2558
    iput-object p2, p0, Ll/᩷֡֨;->᩶:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 2

    .line 2571
    invoke-virtual {p0}, Ll/᩷֡֨;->֫()Ll/ܽܶ۠;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽܶ۠;->֫(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 2580
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object p0
.end method

.method public final ֫()Ll/ܽܶ۠;
    .locals 1

    .line 2563
    iget-object v0, p0, Ll/᩷֡֨;->᩹:Ll/ܽܶ۠;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷֡֨;->᩶:Ljava/util/function/Supplier;

    if-eqz v0, :cond_0

    .line 2564
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܶ۠;

    iput-object v0, p0, Ll/᩷֡֨;->᩹:Ll/ܽܶ۠;

    .line 2566
    :cond_0
    iget-object v0, p0, Ll/᩷֡֨;->᩹:Ll/ܽܶ۠;

    return-object v0
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 0

    .line 2580
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method

.method public final ֫(Ll/ۘ۠֨;)V
    .locals 0

    .line 2585
    iput-object p1, p0, Ll/᩷֡֨;->᩶:Ljava/util/function/Supplier;

    const/4 p1, 0x0

    .line 2586
    iput-object p1, p0, Ll/᩷֡֨;->᩹:Ll/ܽܶ۠;

    return-void
.end method
