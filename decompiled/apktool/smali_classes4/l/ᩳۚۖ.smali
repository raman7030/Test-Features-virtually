.class public final Ll/ᩳۚۖ;
.super Ljava/util/AbstractList;
.source "Z93V"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# instance fields
.field public ᩸:Ll/ܳۚۖ;


# direct methods
.method public constructor <init>(Ll/ܳۚۖ;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 562
    iput-object p1, p0, Ll/ᩳۚۖ;->᩸:Ll/ܳۚۖ;

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 572
    iget-object v0, p0, Ll/ᩳۚۖ;->᩸:Ll/ܳۚۖ;

    invoke-virtual {v0, p1}, Ll/ܳۚۖ;->ۧ(I)Ll/ۘᩴۖ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 567
    iget-object v0, p0, Ll/ᩳۚۖ;->᩸:Ll/ܳۚۖ;

    invoke-virtual {v0}, Ll/ܳۚۖ;->ܳ()I

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 576
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method
