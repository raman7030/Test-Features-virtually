.class public abstract Ll/᩸ۛ֨;
.super Ljava/lang/Object;
.source "M43N"


# instance fields
.field public ֫:Ll/ۙ֨֨;

.field public final synthetic ۧ:Ll/ۜۨ֨;

.field public ܽ:Ll/֨֨֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 692
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۛ֨;->ۧ:Ll/ۜۨ֨;

    .line 693
    iput-object p2, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    .line 694
    iput-object p3, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 721
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v1, v1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const-string v0, "%s[undet=%s,t=%s]"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
.end method

.method public abstract ֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V
.end method
