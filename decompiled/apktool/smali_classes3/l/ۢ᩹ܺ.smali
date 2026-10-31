.class public Ll/ۢ᩹ܺ;
.super Ljava/lang/Object;
.source "E3QI"

# interfaces
.implements Ll/᩻᩸ܺ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ᩸:Ll/ܳ᩶ܺ;


# direct methods
.method public constructor <init>(Ll/ۖ᩸ܺ;)V
    .locals 2

    .line 4664
    new-instance v0, Ll/ܳ᩶ܺ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܳ᩶ܺ;-><init>(Ll/ۖ᩸ܺ;Ll/ᩴ᩸ܺ;)V

    invoke-direct {p0, v0}, Ll/ۢ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܳ᩶ܺ;)V
    .locals 0

    .line 4667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4668
    iput-object p1, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܳ᩶ܺ;I)V
    .locals 0

    .line 4660
    invoke-direct {p0, p1}, Ll/ۢ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 4756
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use ManualSerializationProxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 4752
    new-instance v0, Ll/ۡ᩹ܺ;

    iget-object v1, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-direct {v0, v1}, Ll/ۡ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Integer;Ll/ۤ᩻᩻;)Ljava/lang/Object;
    .locals 1

    .line 4681
    new-instance v0, Ll/᩷᩹ܺ;

    invoke-direct {v0, p2}, Ll/᩷᩹ܺ;-><init>(Ll/ۤ᩻᩻;)V

    iget-object p2, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {p2, p1, v0}, Ll/ܳ᩶ܺ;->֫(Ljava/lang/Object;Ll/ᩴ᩸ܺ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()V
    .locals 6

    .line 4744
    iget-object v0, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    .line 3811
    iget-object v0, v0, Ll/ܳ᩶ܺ;->ᩳ֫:[Ll/ۘ᩹ܺ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 3378
    iget-object v4, v3, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v4, v4, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v4}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v4

    .line 3379
    invoke-virtual {v3, v4, v5}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 3380
    invoke-virtual {v3}, Ll/ۘ᩹ܺ;->ܿ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 4719
    iget-object v0, p0, Ll/ۢ᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->clear()V

    return-void
.end method
