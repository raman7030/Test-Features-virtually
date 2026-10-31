.class public Ll/ۜܶܺ;
.super Ljava/lang/Object;
.source "A52J"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    iput-object p1, p0, Ll/ۜܶܺ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫()Ll/ۜܶܺ;
    .locals 2

    .line 75
    new-instance v0, Ll/ۜܶܺ;

    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۜܶܺ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۜܶܺ;
    .locals 1

    .line 70
    new-instance v0, Ll/ۜܶܺ;

    invoke-direct {v0, p0}, Ll/ۜܶܺ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 492
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/CharSequence;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 1

    .line 196
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0, p1}, Ll/ۜܶܺ;->֫(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V
    .locals 1

    .line 106
    :try_start_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۜܶܺ;->֫(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 108
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Ll/ۜܶܺ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 110
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۜܶܺ;->֫(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 158
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
