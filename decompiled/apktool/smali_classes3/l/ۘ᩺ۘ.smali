.class public final synthetic Ll/ۘ᩺ۘ;
.super Ljava/lang/Object;
.source "0CMQ"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;
.implements Ll/۟ۤ;
.implements Ll/᩷ܿۖ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘ᩺ۘ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ۙ֡֫;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ۘ᩺ۘ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(DDDD)D
    .locals 0

    mul-double p0, p0, p2

    add-double/2addr p0, p4

    div-double/2addr p0, p6

    return-wide p0
.end method

.method public static ֫(Ll/᩸۬ܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I
    .locals 0

    if-eqz p5, :cond_0

    const/4 p0, 0x1

    return p0

    .line 44
    :cond_0
    invoke-interface {p0}, Ll/᩸۬ܳ;->᩵()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 45
    invoke-interface {p0, p1, p2, p3, p4}, Ll/᩸۬ܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 47
    :cond_1
    invoke-interface {p0}, Ll/᩸۬ܳ;->۬()I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/util/Collection;)J
    .locals 2

    .line 63
    instance-of v0, p0, Ll/ᩴ᩺ۘ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ᩴ᩺ۘ;

    invoke-interface {p0}, Ll/ᩴ᩺ۘ;->֫()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static ֫(Ljava/util/ArrayList;I)Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/umeng/commonsdk/debug/UMLogUtils;->makeUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()V
    .locals 1

    .line 58
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ܽ()V
    .locals 1

    .line 44
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/ۘ᩺ۘ;->᩸:I

    .line 4
    check-cast p1, Ll/۬ۘۧ;

    packed-switch v0, :pswitch_data_0

    .line 45
    iget-wide v0, p1, Ll/۬ۘۧ;->ᩳ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 53
    :pswitch_0
    iget-wide v0, p1, Ll/۬ۘۧ;->ۧ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 45
    :cond_0
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 732
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 345
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method
