.class public final Ll/ۙۤܺ;
.super Ll/۠᩶ܺ;
.source "C3Y0"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۬:Ll/ۛܶܺ;


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 375
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 376
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ll/ۛܶܺ;

    iput-object v0, p0, Ll/ۙۤܺ;->۬:Ll/ۛܶܺ;

    .line 377
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    .line 378
    invoke-virtual {p0, p1}, Ll/ܽۙܺ;->֫(Ljava/util/Map;)V

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 366
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 367
    iget-object v0, p0, Ll/ۙۤܺ;->۬:Ll/ۛܶܺ;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 368
    invoke-virtual {p0}, Ll/ܽۙܺ;->ܳ()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 352
    invoke-virtual {p0}, Ll/ܽۙܺ;->ۜ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Set;
    .locals 1

    .line 347
    invoke-virtual {p0}, Ll/ܽۙܺ;->᩷()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/util/Collection;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ۙۤܺ;->۬:Ll/ۛܶܺ;

    invoke-interface {v0}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
