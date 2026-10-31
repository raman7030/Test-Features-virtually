.class public final synthetic Ll/ܺ᩵ۜ;
.super Ljava/lang/Object;
.source "I6L2"

# interfaces
.implements Ll/᩵᩵ۜ;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:I

.field public final synthetic ᩳ:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IJLjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩵ۜ;->֫:Ljava/lang/String;

    iput-object p5, p0, Ll/ܺ᩵ۜ;->ۧ:Ljava/lang/String;

    iput p2, p0, Ll/ܺ᩵ۜ;->ܽ:I

    iput-wide p3, p0, Ll/ܺ᩵ۜ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 0
    iget v2, p0, Ll/ܺ᩵ۜ;->ܽ:I

    iget-wide v3, p0, Ll/ܺ᩵ۜ;->ᩳ:J

    iget-object v0, p0, Ll/ܺ᩵ۜ;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ᩵ۜ;->ۧ:Ljava/lang/String;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ll/ᩳܰۡ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
