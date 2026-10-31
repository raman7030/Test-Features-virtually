.class public final Ll/ܽ᩸ۖ;
.super Ljava/lang/Object;
.source "D549"

# interfaces
.implements Ll/ᩴ᩹ۖ;


# instance fields
.field public ۗ:[Ljava/lang/String;

.field public ۙ:Ljava/util/ArrayList;

.field public ۤ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/util/ArrayList;

.field public ᩶:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:Ljava/util/ArrayList;


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ܽܶۖ;)Ll/ۧ᩸ۖ;
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    .line 95
    :cond_0
    new-instance v0, Ll/ۧ᩸ۖ;

    invoke-direct {v0, p1, p2}, Ll/ۧ᩸ۖ;-><init>(Ljava/lang/String;Ll/ܽܶۖ;)V

    .line 96
    iget-object p1, p0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
