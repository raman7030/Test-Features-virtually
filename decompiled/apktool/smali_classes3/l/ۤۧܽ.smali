.class public final Ll/ۤۧܽ;
.super Ljava/lang/Object;
.source "NAO7"


# instance fields
.field public final ֫:Landroid/app/Activity;

.field public final ۧ:Ll/ۧܽܽ;

.field public ܽ:Ll/ܿܽܽ;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ll/᩺᩹ۧ;Ll/ۧܽܽ;)V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Ll/ۤۧܽ;->֫:Landroid/app/Activity;

    .line 160
    iput-object p3, p0, Ll/ۤۧܽ;->ۧ:Ll/ۧܽܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/app/Activity;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ۤۧܽ;->֫:Landroid/app/Activity;

    return-object v0
.end method

.method public final ֫(Ll/ܿܽܽ;)V
    .locals 1

    .line 164
    iput-object p1, p0, Ll/ۤۧܽ;->ܽ:Ll/ܿܽܽ;

    .line 165
    iget-object v0, p0, Ll/ۤۧܽ;->ۧ:Ll/ۧܽܽ;

    invoke-virtual {v0, p1}, Ll/ۧܽܽ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Ll/۬ۤ;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۤۧܽ;->ۧ:Ll/ۧܽܽ;

    return-object v0
.end method

.method public final ܽ()Ll/ܿܽܽ;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۤۧܽ;->ܽ:Ll/ܿܽܽ;

    return-object v0
.end method
