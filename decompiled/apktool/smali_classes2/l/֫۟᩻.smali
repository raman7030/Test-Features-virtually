.class public final Ll/֫۟᩻;
.super Ljava/lang/Object;
.source "P77N"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;)V
    .locals 0

    .line 5999
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6000
    iput-object p1, p0, Ll/֫۟᩻;->ۧ:Ljava/util/ArrayList;

    .line 6001
    iput-object p2, p0, Ll/֫۟᩻;->ܽ:Ljava/util/HashMap;

    .line 6002
    iput-object p3, p0, Ll/֫۟᩻;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 6009
    iget-object v0, p0, Ll/֫۟᩻;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 6024
    iget-object v0, p0, Ll/֫۟᩻;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩺᩻;)Z
    .locals 1

    .line 6016
    iget-object v0, p0, Ll/֫۟᩻;->֫:Ljava/util/HashSet;

    iget-object p1, p1, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
