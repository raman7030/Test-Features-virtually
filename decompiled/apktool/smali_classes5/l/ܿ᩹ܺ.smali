.class public final Ll/ܿ᩹ܺ;
.super Ll/ۡ᩹ܺ;
.source "E3QI"

# interfaces
.implements Ll/֡᩸ܺ;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ֫֫:Ll/֡᩸ܺ;


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 4625
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 4626
    invoke-virtual {p0}, Ll/ۡ᩹ܺ;->᩻()Ll/ۖ᩸ܺ;

    move-result-object p1

    .line 4627
    iget-object v0, p0, Ll/ۡ᩹ܺ;->۫:Ll/ᩴ᩸ܺ;

    invoke-virtual {p1, v0}, Ll/ۖ᩸ܺ;->֫(Ll/ᩴ᩸ܺ;)Ll/֡᩸ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩹ܺ;->֫֫:Ll/֡᩸ܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 4656
    iget-object v0, p0, Ll/ܿ᩹ܺ;->֫֫:Ll/֡᩸ܺ;

    return-object v0
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4647
    iget-object v0, p0, Ll/ܿ᩹ܺ;->֫֫:Ll/֡᩸ܺ;

    check-cast v0, Ll/ۜ᩹ܺ;

    invoke-virtual {v0, p1}, Ll/ۜ᩹ܺ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
