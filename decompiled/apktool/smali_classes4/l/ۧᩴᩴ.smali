.class public final Ll/ۧᩴᩴ;
.super Ll/ۛ֡ᩴ;
.source "J1MI"

# interfaces
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ܽᩴᩴ;


# direct methods
.method public constructor <init>(Ll/ܽᩴᩴ;I)V
    .locals 0

    .line 612
    iput-object p1, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    .line 923
    invoke-direct {p0, p2}, Ll/ۤ֡ᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 639
    iget-object v0, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    iget v1, v0, Ll/ܽᩴᩴ;->᩶:I

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 624
    iget-object v0, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ܽᩴᩴ;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(I)Ljava/lang/Object;
    .locals 2

    .line 618
    iget-object v0, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    iget-object v1, v0, Ll/ܽᩴᩴ;->᩹:Ll/ᩳᩴᩴ;

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILjava/lang/Object;)V
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ܽᩴᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 634
    iget-object v0, p0, Ll/ۧᩴᩴ;->᩶:Ll/ܽᩴᩴ;

    invoke-virtual {v0, p1}, Ll/ܽᩴᩴ;->remove(I)Ljava/lang/Object;

    return-void
.end method
