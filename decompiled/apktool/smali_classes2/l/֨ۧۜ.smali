.class public final synthetic Ll/֨ۧۜ;
.super Ljava/lang/Object;
.source "M75X"

# interfaces
.implements Ll/ܺ᩻ۜ;


# instance fields
.field public final synthetic ֫:Ll/ܶۧۜ;

.field public final synthetic ۧ:Ll/᩹۟᩻;

.field public final synthetic ܽ:Z

.field public final synthetic ᩳ:Lbin/mt/json/JSONValue;


# direct methods
.method public synthetic constructor <init>(Ll/ܶۧۜ;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۧۜ;->֫:Ll/ܶۧۜ;

    iput-object p2, p0, Ll/֨ۧۜ;->ۧ:Ll/᩹۟᩻;

    iput-boolean p3, p0, Ll/֨ۧۜ;->ܽ:Z

    iput-object p4, p0, Ll/֨ۧۜ;->ᩳ:Lbin/mt/json/JSONValue;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 0
    iget-boolean v2, p0, Ll/֨ۧۜ;->ܽ:Z

    iget-object v3, p0, Ll/֨ۧۜ;->ᩳ:Lbin/mt/json/JSONValue;

    iget-object v0, p0, Ll/֨ۧۜ;->֫:Ll/ܶۧۜ;

    iget-object v1, p0, Ll/֨ۧۜ;->ۧ:Ll/᩹۟᩻;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Ll/ܶۧۜ;->֫(Ll/ܶۧۜ;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
