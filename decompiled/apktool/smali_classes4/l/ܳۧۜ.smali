.class public final synthetic Ll/ܳۧۜ;
.super Ljava/lang/Object;
.source "P75X"

# interfaces
.implements Ll/᩺۟᩻;


# instance fields
.field public final synthetic ֫:Ll/᩻ۧۜ;

.field public final synthetic ۧ:Z

.field public final synthetic ܽ:Ll/᩸۟᩻;

.field public final synthetic ܿ:I

.field public final synthetic ᩳ:Lbin/mt/json/JSONValue;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۧۜ;ZLl/᩸۟᩻;Lbin/mt/json/JSONValue;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۧۜ;->֫:Ll/᩻ۧۜ;

    iput-boolean p2, p0, Ll/ܳۧۜ;->ۧ:Z

    iput-object p3, p0, Ll/ܳۧۜ;->ܽ:Ll/᩸۟᩻;

    iput-object p4, p0, Ll/ܳۧۜ;->ᩳ:Lbin/mt/json/JSONValue;

    iput p5, p0, Ll/ܳۧۜ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟۟᩻;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v3, p0, Ll/ܳۧۜ;->ᩳ:Lbin/mt/json/JSONValue;

    iget v4, p0, Ll/ܳۧۜ;->ܿ:I

    iget-object v0, p0, Ll/ܳۧۜ;->֫:Ll/᩻ۧۜ;

    iget-boolean v1, p0, Ll/ܳۧۜ;->ۧ:Z

    iget-object v2, p0, Ll/ܳۧۜ;->ܽ:Ll/᩸۟᩻;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/᩻ۧۜ;->֫(Ll/᩻ۧۜ;ZLl/᩸۟᩻;Lbin/mt/json/JSONValue;ILl/۟۟᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
