.class public final synthetic Ll/֡۬᩻;
.super Ljava/lang/Object;
.source "J6WT"

# interfaces
.implements Ll/ܶ۬᩻;


# instance fields
.field public final synthetic ֫:Ll/֨۬᩻;

.field public final synthetic ۧ:Ll/ᩴۢۜ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/֨۬᩻;Ll/ᩴۢۜ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۬᩻;->֫:Ll/֨۬᩻;

    iput-object p2, p0, Ll/֡۬᩻;->ۧ:Ll/ᩴۢۜ;

    iput-object p3, p0, Ll/֡۬᩻;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()Ll/ۘۢۜ;
    .locals 3

    .line 215
    iget-object v0, p0, Ll/֡۬᩻;->֫:Ll/֨۬᩻;

    iget-object v0, v0, Ll/֨۬᩻;->۟:Ll/ۗ۬᩻;

    iget-object v1, p0, Ll/֡۬᩻;->ۧ:Ll/ᩴۢۜ;

    iget-object v2, p0, Ll/֡۬᩻;->ܽ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 216
    invoke-static {v0}, Ll/ۗ۬᩻;->ܿ(Ll/ۗ۬᩻;)Ll/ۚۢۜ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۚۢۜ;->֫(Ljava/lang/String;)Ll/ۘۢۜ;

    move-result-object v0

    return-object v0

    .line 218
    :cond_0
    invoke-static {v0}, Ll/ۗ۬᩻;->ܿ(Ll/ۗ۬᩻;)Ll/ۚۢۜ;

    move-result-object v0

    iget-object v1, v1, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ll/ۚۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
