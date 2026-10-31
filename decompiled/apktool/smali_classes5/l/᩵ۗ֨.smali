.class public final Ll/᩵ۗ֨;
.super Ll/᩻֨۠;
.source "17L4"


# instance fields
.field public final synthetic ۧ:Ll/ۗ᩵۠;

.field public final synthetic ܽ:Ll/ۤ֡۠;


# direct methods
.method public constructor <init>(Ll/ۗ᩵۠;Ll/ۤ֡۠;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Ll/᩵ۗ֨;->ۧ:Ll/ۗ᩵۠;

    iput-object p2, p0, Ll/᩵ۗ֨;->ܽ:Ll/ۤ֡۠;

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/ۚۚ۠;)Ll/ۚۚ۠;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩵ۗ֨;->ۧ:Ll/ۗ᩵۠;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/᩵ۗ֨;->ܽ:Ll/ۤ֡۠;

    return-object p1

    .line 136
    :cond_0
    invoke-super {p0, p1}, Ll/᩻֨۠;->ۧ(Ll/ۚۚ۠;)Ll/ۚۚ۠;

    move-result-object p1

    return-object p1
.end method
