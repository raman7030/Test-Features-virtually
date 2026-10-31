.class public final Ll/֡۫ۧ;
.super Ljava/lang/Object;
.source "Q20L"

# interfaces
.implements Ll/۠۫ۧ;


# instance fields
.field public final ֫:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ll/ܶ۫ۧ;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/֡۫ۧ;->֫:Ljava/util/LinkedHashSet;

    const-string v0, "androidx.savedstate.Restarter"

    .line 79
    invoke-virtual {p1, v0, p0}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;Ll/۠۫ۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 3

    .line 83
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֡۫ۧ;->֫:Ljava/util/LinkedHashSet;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "classes_to_restore"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/֡۫ۧ;->֫:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
