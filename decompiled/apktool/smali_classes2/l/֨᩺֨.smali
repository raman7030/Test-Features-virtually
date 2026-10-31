.class public final synthetic Ll/֨᩺֨;
.super Ljava/lang/Object;
.source "8459"

# interfaces
.implements Ll/ۨ᩺֨;


# instance fields
.field public final synthetic ֫:Ll/᩺᩺֨;

.field public final synthetic ۧ:Ll/ۜۚ۠;

.field public final synthetic ܽ:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩺᩺֨;Ll/ۜۚ۠;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩺֨;->֫:Ll/᩺᩺֨;

    iput-object p2, p0, Ll/֨᩺֨;->ۧ:Ll/ۜۚ۠;

    iput-boolean p3, p0, Ll/֨᩺֨;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 5

    .line 3276
    iget-object v0, p0, Ll/֨᩺֨;->ۧ:Ll/ۜۚ۠;

    iget-object v1, v0, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    iget-object v1, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    new-instance v2, Ll/᩵᩺֨;

    iget-object v3, p0, Ll/֨᩺֨;->֫:Ll/᩺᩺֨;

    iget-boolean v4, p0, Ll/֨᩺֨;->ܽ:Z

    invoke-direct {v2, v3, v0, p1, v4}, Ll/᩵᩺֨;-><init>(Ll/᩺᩺֨;Ll/ۜۚ۠;Ll/۫᩵۠;Z)V

    invoke-virtual {v3, p1, v1, v2}, Ll/᩺᩺֨;->֫(Ll/۫᩵۠;Ll/ۙ֨֨;Ll/ۨ᩺֨;)Ll/۫᩵۠;

    move-result-object p1

    return-object p1
.end method
