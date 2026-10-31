.class public final synthetic Ll/ۜ۬ܿ;
.super Ljava/lang/Object;
.source "6AK0"

# interfaces
.implements Ll/֨۬ܿ;


# instance fields
.field public final synthetic ֫:Ljava/util/HashMap;

.field public final synthetic ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ۬ܿ;->֫:Ljava/util/HashMap;

    iput-object p2, p0, Ll/ۜ۬ܿ;->ۧ:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/ۜ۬ܿ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    check-cast p2, Ll/֡۬ܿ;

    .line 59
    iget-object v0, p0, Ll/ۜ۬ܿ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡۬ܿ;

    if-eqz p1, :cond_1

    .line 61
    iget-object v0, p2, Ll/֡۬ܿ;->᩶:Ljava/lang/Object;

    iget-object v1, p1, Ll/֡۬ܿ;->᩶:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object p1, p2, Ll/֡۬ܿ;->ۙ:Ljava/lang/String;

    iget-object p2, p0, Ll/ۜ۬ܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_0
    new-instance v0, Ll/ۚ۬ܿ;

    invoke-direct {v0, p2, p1}, Ll/ۚ۬ܿ;-><init>(Ll/֡۬ܿ;Ll/֡۬ܿ;)V

    iget-object p1, p0, Ll/ۜ۬ܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
