.class public final Ll/֨ᩴ᩻;
.super Ljava/lang/Object;
.source "M7HK"

# interfaces
.implements Ll/ᩴۡۘ;
.implements Ll/᩷ۡۘ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/֨ᩴ᩻;->ۧ:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Ll/֨ᩴ᩻;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getPassword()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/֨ᩴ᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/֨ᩴ᩻;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/֨ᩴ᩻;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    array-length p1, p1

    if-lez p1, :cond_0

    .line 55
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 34
    iget-object v0, p0, Ll/֨ᩴ᩻;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 39
    iget-object v0, p0, Ll/֨ᩴ᩻;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
