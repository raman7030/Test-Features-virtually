.class public final synthetic Ll/֡֫ۜ;
.super Ljava/lang/Object;
.source "T761"

# interfaces
.implements Ll/ܺ᩻ۜ;


# instance fields
.field public final synthetic ֫:Ll/֨֫ۜ;

.field public final synthetic ۧ:Ll/ۚ۟᩻;


# direct methods
.method public synthetic constructor <init>(Ll/֨֫ۜ;Ll/ۚ۟᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֫ۜ;->֫:Ll/֨֫ۜ;

    iput-object p2, p0, Ll/֡֫ۜ;->ۧ:Ll/ۚ۟᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/֡֫ۜ;->֫:Ll/֨֫ۜ;

    iget-object v1, p0, Ll/֡֫ۜ;->ۧ:Ll/ۚ۟᩻;

    invoke-static {v0, v1, p1, p2}, Ll/֨֫ۜ;->֫(Ll/֨֫ۜ;Ll/ۚ۟᩻;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
