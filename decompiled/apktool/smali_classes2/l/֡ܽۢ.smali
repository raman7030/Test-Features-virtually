.class public final Ll/֡ܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/᩶ۛ᩷;


# instance fields
.field public final synthetic ֫:Ll/᩷ܽۢ;

.field public final synthetic ۧ:Ll/۫ۧۢ;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩷ܽۢ;Ll/۫ۧۢ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 535
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܽۢ;->֫:Ll/᩷ܽۢ;

    iput-object p2, p0, Ll/֡ܽۢ;->ۧ:Ll/۫ۧۢ;

    iput-object p3, p0, Ll/֡ܽۢ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/֡ܽۢ;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;)Ll/֨ۛ᩷;
    .locals 3

    .line 548
    new-instance v0, Ll/֨ۛ᩷;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Override: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֡ܽۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֡ܽۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v2, v1, p1}, Ll/֨ۛ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public final ֫()Ll/۠ۛ᩷;
    .locals 1

    .line 538
    iget-object v0, p0, Ll/֡ܽۢ;->֫:Ll/᩷ܽۢ;

    return-object v0
.end method

.method public final ֫(Ljava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 543
    iget-object v2, p0, Ll/֡ܽۢ;->ۧ:Ll/۫ۧۢ;

    const-string v3, ""

    invoke-virtual {v2, p1, v3, v0, v1}, Ll/۫ۧۢ;->֫(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;ZLjava/util/function/Predicate;)V

    return-void
.end method
